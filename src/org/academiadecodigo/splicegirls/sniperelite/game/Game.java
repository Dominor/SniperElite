package org.academiadecodigo.splicegirls.sniperelite.game;

import org.academiadecodigo.splicegirls.sniperelite.Randomizer;
import org.academiadecodigo.splicegirls.sniperelite.gameobjects.*;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game (int numberObjects) {
        this.gameObjects = createObjects(numberObjects);
        this.sniperRifle = new SniperRifle();
        this.shotsFired = 0;
    }

    public void start(){

        for (GameObject gameObject: gameObjects) {

            if (gameObject instanceof Enemy) {
                System.out.println("\n Beginning exterminations of HUMAAANSS \n");
                Enemy enemy = (Enemy) gameObject;

                while(!enemy.isDead()) {
                    sniperRifle.shoot((Enemy) gameObject);
                    this.shotsFired++;
                    System.out.println(gameObject.getMessage());
                }

                continue;
            }

            // Only reachable if gameObject is a Tree.
            System.out.println(gameObject.getMessage());
        }
        System.out.println("Everyone is dead. Skynet is coming... " + shotsFired + " shots fired.");
    }

    public GameObject[] createObjects (int numberObjects) {

        GameObject[] gameObjects = new GameObject[numberObjects];
        double creationChance;

        for (int i = 0; i < gameObjects.length; i++) {

            creationChance = Randomizer.getRandom(11, 1);

            if (creationChance < 8.5) {
                gameObjects[i] = new Tree();
                continue;
            }
            if (creationChance < 7) {
                gameObjects[i] = new SoldierEnemy();
                continue;
            }
                gameObjects[i] = new ArmouredEnemy();
        }
        return gameObjects;
    }
}
