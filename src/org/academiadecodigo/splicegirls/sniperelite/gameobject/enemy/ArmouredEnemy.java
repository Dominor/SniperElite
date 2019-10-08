package org.academiadecodigo.splicegirls.sniperelite.gameobject.enemy;

public class ArmouredEnemy extends Enemy {
    private int armour;

    public ArmouredEnemy (int health, int armour) {
        super(health);
        this.armour = armour;
    }

    @Override
    public void hit(int damage) {
        if (damage < 0) {
            return;
        }
        if (damage > armour) {
            armour = 0;
            super.hit(damage - armour);
        } else if (damage == armour) {
            armour = 0;
        } else {
            armour = armour - damage;
        }
        System.out.println("Damage taken " + damage);
    }

    @Override
    public String getMessage () {
        if (armour == 0) {
            return "\n NOOO. My armour is gone. PLEASE don't kill me. \n" + super.getMessage() + "\n";
        }
        return "\n" + super.getMessage() + "HAHA. Now you shall never kill me. I have armour the most amazing in the whole Universe, not even Galactus himself can kill me. (" + armour + " left). \n";
    }
}
