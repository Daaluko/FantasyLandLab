package Interfaces;

import Enemy.Enemy;

public interface ISpell {
    void cast(Enemy enemy, ISpell spell);
}
