package org.academiadecodigo.splicegirls.sniperelite;

import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.*;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Enemy createEnemy () {

        return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);
    }
}
