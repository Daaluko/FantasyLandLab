package Players;

import Enemy.Enemy;
import Interfaces.IWeapon;

public class Knight extends Fighter {
    protected Knight(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public void attack(Enemy enemy) {

    }

    @Override
    public Object getAxe() {
        return null;
    }

    @Override
    public void changeToAxe() {

    }

    @Override
    public void changeToClub() {

    }

    @Override
    public void changeToSword() {

    }

    @Override
    public int getDamage() {
        return 0;
    }
}
