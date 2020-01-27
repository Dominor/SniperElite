package org.academiadecodigo.splicegirls.sniperelite;

import org.academiadecodigo.splicegirls.sniperelite.Randomizer;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.*;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.decor.Tree;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.ArmouredEnemy;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.Enemy;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy.SoldierEnemy;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.stuff.Barrel;
import org.academiadecodigo.splicegirls.sniperelite.gameobject.weapons.SniperRifle;

public class Game {

    public static final double ENEMY_PROBABILITY = 0.6;
    public static final int BULLET_DAMAGE = 1;

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;

    public Game (int numberObjects) {
        this.gameObjects = createObjects(numberObjects);
        this.sniperRifle = new SniperRifle(BULLET_DAMAGE);
    }

    public void start(){

        for (GameObject gameObject: gameObjects) {

            if (gameObject instanceof Destroyable) {
                System.out.println("\n Beginning exterminations of HUMAAANSS and ... NON-HUMANS?! To be or not to be ...? \n");
                Destroyable target = (Destroyable) gameObject;

                while(!target.isDestroyed()) {
                    sniperRifle.shoot(target);
                    System.out.println(gameObject.getMessage());
                }

                continue;
            }

            // Only reachable if gameObject is a Tree.
            System.out.println(gameObject.getMessage());
        }
        System.out.println("Everyone is dead. Skynet is coming (Or not) (To be or not to be?)... " + sniperRifle.getShotsFired() + " shots fired.");
    }

    public GameObject[] createObjects (int numberObjects) {

        GameObject[] gameObjects = new GameObject[numberObjects];

        for (int i = 0; i < gameObjects.length; i++) {

            gameObjects[i] = Math.random() < ENEMY_PROBABILITY ? GameObjectFactory.createEnemy() : GameObjectFactory.createNonEnemies();
        }
        return gameObjects;
    }
}
