package org.academiadecodigo.splicegirls.sniperelite;

public class Enemy extends GameObject {

    private int health;
    private boolean isDead;

    public Enemy () {
        this.health = 100;
        this.isDead = false;
    }

    public boolean isDead() {
        return isDead;
    }

    public void hit (int damage) {
        if (health < damage) {
            health = 0;
            isDead = true;
            return;
        }
        health -= damage;
        if (health == 0) {
            isDead = true;
        }
    }

    @Override
    public String getMessage() {
        if (isDead) {
            return "One coin for Charon please. Ease my crossing!";
        }
        return "I am immortal. You shall never kill me. " + health + " points left.";
    }
}
