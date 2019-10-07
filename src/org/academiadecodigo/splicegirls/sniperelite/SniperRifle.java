package org.academiadecodigo.splicegirls.sniperelite;

public class SniperRifle  {

    private int bulletDamage;
    private double hitChance;

    public SniperRifle () {
        this.bulletDamage = 10;
        this.hitChance = Randomizer.getRandom(10, 1);;
    }

    public void shoot (Enemy enemy) {
        double hitChance = Randomizer.getRandom(10, 1);
        if (this.hitChance >= hitChance) {
            enemy.hit(this.bulletDamage);
        }
    }
}
