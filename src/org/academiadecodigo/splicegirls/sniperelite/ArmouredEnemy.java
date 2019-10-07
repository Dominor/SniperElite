package org.academiadecodigo.splicegirls.sniperelite;

public class ArmouredEnemy extends Enemy {
    private int armour;

    public ArmouredEnemy () {
        super();
        this.armour = 100;
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
            return "NOOO. My armour is gone. PLEASE don't kill me. \n" + super.getMessage();
        }
        return super.getMessage() + "HAHA. Now you shall never kill me. I have armour the most amazing in the whole Universe, not even Galactus himself can kill me. (" + armour + " left).";
    }
}
