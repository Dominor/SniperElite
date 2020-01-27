package org.academiadecodigo.splicegirls.sniperelite;

import org.academiadecodigo.splicegirls.sniperelite.gameobject.GameObject;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.decor.Tree;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.*;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.stuff.Barrel;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.stuff.BarrelType;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;
    public static int NON_ENEMY_HP = 3;

    public static Enemy createEnemy () {

        return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);
    }

    public static GameObject createNonEnemies () {

        double upperLimit = Game.ENEMY_PROBABILITY + (1 - Game.ENEMY_PROBABILITY/2);
        double chance = Math.random();

        return chance > Game.ENEMY_PROBABILITY && chance < upperLimit ? new Tree() : new Barrel(BarrelType.values()[(int) Math.random() * 3], NON_ENEMY_HP);
    }
}
