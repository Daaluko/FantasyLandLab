package Interfaces;

import Enemy.Enemy;

public interface IFighter {
    void attack(Enemy enemy);


    Object getAxe();

    void changeToAxe();

    IWeapon getWeapon();


    void changeToClub();


    void changeToSword();
}
