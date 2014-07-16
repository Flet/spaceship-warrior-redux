package net.brokenspork.systems;

import net.brokenspork.components.ParallaxStar;
import net.brokenspork.components.Position;
import net.brokenspork.core.Constants;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.IntervalEntityProcessingSystem;

@Wire
public class ParallaxStarRepeatingSystem extends IntervalEntityProcessingSystem {
	private ComponentMapper<Position> positionMapper;

	@SuppressWarnings("unchecked")
    public ParallaxStarRepeatingSystem() {
		super(Aspect.getAspectForAll(ParallaxStar.class, Position.class), 1);
	}

	@Override
	protected void process(Entity e) {
		Position position = positionMapper.get(e);

		if (position.y < -Constants.FRAME_HEIGHT / 2) {
			position.y = Constants.FRAME_HEIGHT / 2;
		}
	}

}
