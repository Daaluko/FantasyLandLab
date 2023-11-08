package Spells;

import Interfaces.ISpell;

public class Accio implements ISpell {
    private int power;

    public Accio(int power) {
        this.power = 20;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void cast() {

    }


}
