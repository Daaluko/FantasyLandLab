package Players;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends Mage implements IDefend, ISpell {
    protected Warlock(String name, int health) {
        super(name, health);
    }
}
