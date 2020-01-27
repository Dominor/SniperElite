package org.academiadecodigo.splicegirls.sniperelite.gameobject.stuff;

import org.academiadecodigo.splicegirls.sniperelite.gameobject.*;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;

    public Barrel (BarrelType barrelType, int currentDamage) {
        this.currentDamage = currentDamage;
        this.barrelType = barrelType;
    }

    public void hit (int damage) {

        if (currentDamage < damage) {
            currentDamage = 0;
            return;
        }
        currentDamage -= damage;
    }

    public boolean isDestroyed() {
        return currentDamage == 0;
    }

    public String getMessage () {
        return "I am a Barrel of type " + barrelType + " with hit points of " + currentDamage;
    }
}
