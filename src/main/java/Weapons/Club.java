package Weapons;

import Enemy.Enemy;
import Interfaces.IWeapon;

public class Club implements IWeapon {
    private int damage;


    public Club(int damage) {
        this.damage = 15;
    }


    public int getDamage() {
        return damage;
    }

}
