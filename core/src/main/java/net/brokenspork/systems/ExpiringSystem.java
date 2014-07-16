package net.brokenspork.systems;

import net.brokenspork.components.Expires;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.DelayedEntityProcessingSystem;

@Wire
public class ExpiringSystem extends DelayedEntityProcessingSystem {
	private ComponentMapper<Expires> expirationMapper;

	@SuppressWarnings("unchecked")
    public ExpiringSystem() {
		super(Aspect.getAspectForAll(Expires.class));
	}
	
	@Override
	protected void processDelta(Entity e, float accumulatedDelta) {
		Expires expires = expirationMapper.get(e);
		expires.delay -= accumulatedDelta;
	}

	@Override
	protected void processExpired(Entity e) {
		e.deleteFromWorld();
	}
	
	@Override
	protected float getRemainingDelay(Entity e) {
		Expires expires = expirationMapper.get(e);
		return expires.delay;
	}
}
