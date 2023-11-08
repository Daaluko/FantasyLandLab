package Players;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends Mage implements IDefend, ISpell {
    protected Warlock(String name, int health) {
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
