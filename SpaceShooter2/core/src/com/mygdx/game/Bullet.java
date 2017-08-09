package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by GeekBrains on 29.04.2017.
 */
public class Bullet {
    Vector2 position;
    float speed;
    boolean active;

    public Bullet() {
        position = new Vector2(0, 0);
        speed = 16.0f;
        active = false;
    }

    public void enable(float x, float y) {
        position.x = x;
        position.y = y;
        active = true;
    }

    public void disable() {
        active = false;
    }

    public void update() {
        position.x += speed;
        if (position.x > 1280) {
            disable();
        }
    }
}
