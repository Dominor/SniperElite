package org.academiadecodigo.splicegirls.sniperelite.gameobject.weapons;

import org.academiadecodigo.splicegirls.sniperelite.Randomizer;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.Enemy;

public class SniperRifle  {

    private final double HIT_PROBABILITY = 0.7;
    private int bulletDamage;
    private int shotsFired;

    public SniperRifle (int bulletDamage) {
        this.bulletDamage = bulletDamage;
        this.shotsFired = 0;
    }

    public void shoot (Enemy enemy) {

        if (Math.random() < HIT_PROBABILITY) {
            enemy.hit(this.bulletDamage);
            shotsFired++;
            return;
        }
        System.out.println("I missed. Damn Zeus!");
    }

    public int getShotsFired() {
        return shotsFired;
    }
}
