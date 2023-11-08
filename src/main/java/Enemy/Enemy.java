package Enemy;

import Interfaces.IWeapon;

public abstract class Enemy {
    private int health;



    protected Enemy(int health) {
        this.health = health;
    }




public int getHealth() {
        return health;
    }
}