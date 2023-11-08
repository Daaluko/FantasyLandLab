package Enemy;

import Interfaces.IWeapon;

public class Orc extends Enemy {

    public Orc(int health) {
        super(health);
    }

    public int getHealth() {
        return super.getHealth();
    }


    public int takeDamage(IWeapon attack){
        Enemy enemy = new Orc(100);
        return getHealth() - attack.attack(enemy);
    }
}
