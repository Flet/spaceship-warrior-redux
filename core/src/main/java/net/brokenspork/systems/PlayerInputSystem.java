package net.brokenspork.systems;

import net.brokenspork.components.Player;
import net.brokenspork.components.Position;
import net.brokenspork.components.Velocity;
import net.brokenspork.core.EntityFactory;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

@Wire
public class PlayerInputSystem extends EntityProcessingSystem implements InputProcessor {
	private static final float FireRate = 0.1f;
	
	private ComponentMapper<Position> positionMapper;
	
	private EntityFactory entityFactory;
	
	private boolean shoot;
	private float timeToFire;
	
	private float destinationX, destinationY;
	private OrthographicCamera camera;
	private Vector3 mouseVector;
	private Rectangle viewport;
	
	private Vector2 tmp = new Vector2();
	
	@SuppressWarnings("unchecked")
    public PlayerInputSystem(OrthographicCamera camera, Rectangle viewport) {
		super(Aspect.getAspectForAll(Position.class, Velocity.class, Player.class));
		this.camera = camera;
		this.mouseVector = new Vector3(Gdx.input.getX(), Gdx.input.getY(),0);
		this.viewport = viewport;
	}
	
	@Override
	protected void initialize() {
		Gdx.input.setInputProcessor(this);
	}

	@Override
	protected void process(Entity e) {
		Position position = positionMapper.get(e);
		
		mouseVector.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		camera.unproject(mouseVector, viewport.getX(), viewport.getY(), viewport.getWidth(), viewport.getHeight());
		
		destinationX = mouseVector.x;
		destinationY = mouseVector.y;
		
		tmp.set(position.x, position.y).sub(destinationX, destinationY);
		float angleInRadians = tmp.angleRad();
		
		position.x += MathUtils.cos(angleInRadians) * 500f * world.delta;
		position.y += MathUtils.sin(angleInRadians) * 500f * world.delta;
		
		position.x = mouseVector.x;
		position.y = mouseVector.y;
		
		if(shoot) {
			if(timeToFire <= 0) {
				entityFactory.createPlayerBullet(position.x-27, position.y+2);
				entityFactory.createPlayerBullet(position.x+27, position.y+2);
				timeToFire = FireRate;
			}
		}
		if(timeToFire > 0) {
			timeToFire -= world.delta;
			if(timeToFire < 0) {
				timeToFire = 0;
			}
		}
	}

	@Override
	public boolean keyDown(int keycode) {
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int x, int y, int pointer, int button) {
		if(button == Input.Buttons.LEFT) {
			shoot = true;
		}
		return false;
	}

	@Override
	public boolean touchUp(int x, int y, int pointer, int button) {
		if(button == Input.Buttons.LEFT) {
			shoot = false;
		}
		return true;
	}

	@Override
	public boolean touchDragged(int x, int y, int pointer) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

	public void setViewport(Rectangle viewport) {
	    this.viewport = viewport;
    }

}
