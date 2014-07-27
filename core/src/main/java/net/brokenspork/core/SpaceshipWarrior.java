package net.brokenspork.core;

import com.badlogic.gdx.Game;

public class SpaceshipWarrior extends Game {

	private GameScreen gameScreen;

	@Override
	public void create() {
		this.gameScreen = new GameScreen();
		setScreen(gameScreen);
	}

}
