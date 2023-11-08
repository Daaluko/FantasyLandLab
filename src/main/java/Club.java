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

    @Override
    public int attack(Enemy enemyHealth) {
        return enemyHealth.getHealth() - damage;
    }
}
