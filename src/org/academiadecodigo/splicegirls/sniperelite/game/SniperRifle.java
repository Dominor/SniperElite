package org.academiadecodigo.splicegirls.sniperelite.game;

import org.academiadecodigo.splicegirls.sniperelite.Randomizer;
import org.academiadecodigo.splicegirls.sniperelite.gameobjects.Enemy;

public class SniperRifle  {

    private int bulletDamage;
    private double hitChance;

    public SniperRifle () {
        this.bulletDamage = 10;
        this.hitChance = Randomizer.getRandom(11, 1);;
    }

    public void shoot (Enemy enemy) {
        double hitChance = Randomizer.getRandom(11, 1);
        if (this.hitChance >= hitChance) {
            enemy.hit(this.bulletDamage);
            return;
        }
        System.out.println("I missed. Damn Zeus!");
    }
}
