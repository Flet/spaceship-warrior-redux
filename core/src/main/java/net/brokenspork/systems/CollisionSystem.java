package net.brokenspork.systems;

import net.brokenspork.components.Bounds;
import net.brokenspork.components.Health;
import net.brokenspork.components.Position;
import net.brokenspork.core.Constants;
import net.brokenspork.core.EntityFactory;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.EntitySystem;
import com.artemis.annotations.Wire;
import com.artemis.managers.GroupManager;
import com.artemis.utils.Bag;
import com.artemis.utils.ImmutableBag;
import com.badlogic.gdx.math.Vector2;

@Wire
public class CollisionSystem extends EntitySystem {
	private ComponentMapper<Position> positionMapper;
	private ComponentMapper<Bounds> boundsMapper;
	private ComponentMapper<Health> healthMapper;
	
	private Bag<CollisionPair> collisionPairs;
	
	@SuppressWarnings("unchecked")
	public CollisionSystem() {
		super(Aspect.getAspectForAll(Position.class, Bounds.class));
	}

	@Override
	public void initialize() {
		collisionPairs = new Bag<CollisionPair>();
		
		collisionPairs.add(new CollisionPair(Constants.Groups.PLAYER_BULLETS, Constants.Groups.ENEMY_SHIPS, new CollisionHandler() {
			@Override
			public void handleCollision(Entity bullet, Entity ship) {
				Position bp = positionMapper.get(bullet);
				EntityFactory.createSmallExplosion(world, bp.x, bp.y).addToWorld();
				for(int i = 0; 4 > i; i++) EntityFactory.createParticle(world, bp.x, bp.y).addToWorld();
				
				//TODO: calling bullet.deleteFromWorld() was causing null pointer exceptions in ExpiringSystem and CollisionStstem because it did not exist anymore. 
				//TODO: This did not happen in vanilla artemis.
				//TODO: is this a Is this a bug in artemis-odb's DelayedEntityProcessingSystem?
				bullet.deleteFromWorld();
				//Expires bulletExpires = ex.get(bullet);
				//if(bulletExpires != null) {
				//	bulletExpires.delay = -1;
				//}

				Health health = healthMapper.get(ship);
				Position position = positionMapper.get(ship);
				health.health -= 1;
				if(health.health < 0) {
					health.health = 0;
					ship.deleteFromWorld();
					EntityFactory.createBigExplosion(world, position.x, position.y).addToWorld();
				}
			}
		}));
	}
	
	@Override
	protected void processEntities(ImmutableBag<Entity> entities) {
		for(int i = 0; collisionPairs.size() > i; i++) {
			collisionPairs.get(i).checkForCollisions();
		}
	}


	@Override
	protected boolean checkProcessing() {
		return true;
	}
	
	
	private class CollisionPair {
		private ImmutableBag<Entity> groupEntitiesA;
		private ImmutableBag<Entity> groupEntitiesB;
		private CollisionHandler handler;

		public CollisionPair(String group1, String group2, CollisionHandler handler) {
			groupEntitiesA = world.getManager(GroupManager.class).getEntities(group1);
			groupEntitiesB = world.getManager(GroupManager.class).getEntities(group2);
			this.handler = handler;
		}

		public void checkForCollisions() {
			for(int a = 0; groupEntitiesA.size() > a; a++) {
				for(int b = 0; groupEntitiesB.size() > b; b++) {
					Entity entityA = groupEntitiesA.get(a);
					Entity entityB = groupEntitiesB.get(b);
					if(collisionExists(entityA, entityB)) {
						handler.handleCollision(entityA, entityB);
					}
				}
			}
		}
		
		private boolean collisionExists(Entity e1, Entity e2) {
			
			if(e1 == null || e2 == null) {
				return false;
			}
			
			//NPE!!!
			Position p1 = positionMapper.get(e1);
			Position p2 = positionMapper.get(e2);
			
			Bounds b1 = boundsMapper.get(e1);
			Bounds b2 = boundsMapper.get(e2);

			return (Vector2.len(p1.x - p2.x, p1.y - p2.y) - b1.radius) < b2.radius;
		}
	}
	
	private interface CollisionHandler {
		void handleCollision(Entity a, Entity b);
	}

}
