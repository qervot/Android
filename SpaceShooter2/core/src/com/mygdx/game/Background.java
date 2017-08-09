package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by GeekBrains on 29.04.2017.
 */
public class Background {
    class Star {
        Vector2 position;
        float speed;

        public Star() {
            position = new Vector2((float) Math.random() * 1280, (float) Math.random() * 720);
            speed = 1.0f + (float)Math.random() * 3.0f;
        }

        public void update() {
            position.x -= speed;
            if (position.x < -20) {
                position.x = 1280;
                position.y = (float) Math.random() * 720;
                speed = 1.0f + (float)Math.random() * 3.0f;
            }
        }
    }

    Texture texture;
    Texture textureStar;
    Star[] stars;

    public Background() {
        texture = new Texture("bg.png");
        textureStar = new Texture("star12.tga");
        stars = new Star[240];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star();
        }
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, 0, 0);
        for (int i = 0; i < stars.length; i++) {
            batch.draw(textureStar, stars[i].position.x, stars[i].position.y);
        }
    }

    public void update() {
        for (int i = 0; i < stars.length; i++) {
            stars[i].update();
        }
    }
}
