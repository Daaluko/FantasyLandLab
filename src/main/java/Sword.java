import Enemy.Enemy;
import Interfaces.IWeapon;

public class Sword implements IWeapon {
    private int damage;

    public Sword(int damage) {
        this.damage = 40;
    }


    @Override
    public int attack(Enemy enemyHealth) {
        return  enemyHealth.getHealth() - damage;
    }
}
