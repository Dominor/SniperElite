package org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy;

import org.academiadecodigo.splicegirls.sniperelite.gameobject.*;

public class Enemy extends GameObject implements Destroyable {

    private int health;

    public Enemy (int health) {
        this.health = health;
    }

    public boolean isDead() {
        return health == 0;
    }

    public void hit (int damage) {
        if (health < damage) {
            health = 0;
            return;
        }
        health -= damage;
    }

    public boolean isDestroyed () {
        return health == 0;
    }

    @Override
    public String getMessage() {
        if (isDead()) {
            return "\n One coin for Charon please. Ease my crossing! \n";
        }
        return "\n I am immortal. You shall never kill me. " + health + " points left. \n";
    }
}
