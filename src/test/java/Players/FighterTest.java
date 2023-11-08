package Players;

import Interfaces.IFighter;
import Interfaces.IWeapon;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {
    Knight fighter1;
    Barbarian fighter2;
    Dwarf fighter3;
    Sword sword1;
    Axe axe1;
    Club club1;
    @Before
    public void before(){
        fighter1 = new Knight("Jeff", 100, sword1);
        fighter2 = new Barbarian("Jim", 100, club1);
        fighter3 = new Dwarf("John", 100, axe1);
        sword1 = new Sword(40);
        axe1 = new Axe(40);
        club1 = new Club(15);
    }

    @Test
    public void canSwitchToAxe(){
        fighter1.changeToAxe(axe1);
        assertEquals(axe1, fighter1.getWeapon());
    }

    @Test
    public void canSwitchToClub(){
        fighter3.changeToClub(club1);
        assertEquals(club1,fighter3.getWeapon());
    }

    @Test
    public void canSwitchToSword(){
        fighter2.changeToSword(sword1);
        assertEquals(sword1,fighter2.getWeapon());
    }

}