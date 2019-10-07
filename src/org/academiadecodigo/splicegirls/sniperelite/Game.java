package org.academiadecodigo.splicegirls.sniperelite;

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
                System.out.println("Beginning exterminations of HUMAAANSS");
                Enemy enemy = (Enemy) gameObject;

                while(!enemy.isDead()) {
                    sniperRifle.shoot((Enemy) gameObject);
                    this.shotsFired++;
                    System.out.println(gameObject.getMessage());
                }

                continue;
            }
            gameObject.getMessage();
        }
        System.out.println("Everyone is dead. Skynet is coming... " + shotsFired + " shots fired.");
    }

    public GameObject[] createObjects (int numberObjects) {

        GameObject[] gameObjects = new GameObject[numberObjects];
        double creationChance;

        for (int i = 0; i < gameObjects.length; i++) {

            creationChance = Randomizer.getRandom(10, 1);

            if (creationChance > 7) {
                gameObjects[i] = new Tree();
                continue;
            }
            if (creationChance > 3) {
                gameObjects[i] = new SoldierEnemy();
                continue;
            }

                gameObjects[i] = new ArmouredEnemy();
        }
        return gameObjects;
    }
}
