import Enemy.Enemy;
import Interfaces.IWeapon;

public class Axe implements IWeapon {
    private int damage;


    public Axe(int damage) {
        this.damage = 40;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public int attack(Enemy enemyHealth) {
        return enemyHealth.getHealth() - damage ;
    }
}
