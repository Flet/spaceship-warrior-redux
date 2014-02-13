package net.brokenspork.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import net.brokenspork.core.SpaceshipWarrior;

public class SpaceshipWarriorDesktop {
    
    public static final int FRAME_WIDTH = 1280;
    public static final int FRAME_HEIGHT = 900;
    
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.useGL20 = true;

        config.fullscreen = false;
        config.width = FRAME_WIDTH;
        config.height = FRAME_HEIGHT;
        config.vSyncEnabled = false;
        config.title = "Spaceship Warrior";
        new LwjglApplication(new SpaceshipWarrior(), config);
    }
}
