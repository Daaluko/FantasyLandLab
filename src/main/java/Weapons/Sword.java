package Weapons;

import Enemy.Enemy;
import Interfaces.IWeapon;

public class Sword implements IWeapon {
    private int damage;

    public Sword(int damage) {
        this.damage = 40;
    }


    public int getDamage() {
        return damage;
    }
}
