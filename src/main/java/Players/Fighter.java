package Players;

import Enemy.Enemy;
import Interfaces.IFighter;
import Interfaces.IWeapon;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;

public abstract class Fighter extends Player implements IFighter, IWeapon {
    IWeapon weapon;
    protected Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


    public IWeapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy, IWeapon weapon) {
        enemy.takeDamage(weapon.getDamage());
    }

    public void changeToAxe(Axe axe) {
        setWeapon(axe);
    }

    public void changeToSword(Sword sword) {
        setWeapon(sword);
    }

    public void changeToClub(Club club) {
        setWeapon(club);
    }

    }




