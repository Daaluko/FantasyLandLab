package Spells;

import Interfaces.ISpell;

public class Stupefy implements ISpell {
    private int power;

    public Stupefy(int power) {
        this.power = 40;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void cast(){

    }
}
