package Enemy;

import Interfaces.IWeapon;

public abstract class Enemy {
    protected int health;

    protected Enemy(int health) {
        this.health = health;
    }




    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;

    }
}