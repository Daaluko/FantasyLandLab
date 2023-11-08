package Weapons;

import Interfaces.IWeapon;

public class Axe implements IWeapon {
    private int damage;


    public Axe(int damage) {
        this.damage = 40;
    }

    public int getDamage() {
        return damage;
    }

}
