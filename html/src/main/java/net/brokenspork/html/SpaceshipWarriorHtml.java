package net.brokenspork.html;

import net.brokenspork.core.SpaceshipWarrior;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class SpaceshipWarriorHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new SpaceshipWarrior();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(800, 600);
	}
}
