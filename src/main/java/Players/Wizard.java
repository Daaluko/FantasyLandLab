package Players;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Wizard extends Mage implements IDefend, ISpell {
    protected Wizard(String name, int health) {
        super(name, health);
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public int cast() {
        return 0;
    }
}
