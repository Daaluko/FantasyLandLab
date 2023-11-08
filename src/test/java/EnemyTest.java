import Interfaces.IWeapon;
import Weapons.Axe;
import org.junit.Before;
import Enemy.Orc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Orc enemy1;
    Axe axe1;
    IWeapon axe2;
    @Before
    public void before(){
        enemy1 = new Orc(100);
        axe1 = new Axe(40);
        axe2 = new Axe(40);
    }


//    @Test
//    public void canGetHealth(){
//        assertEquals(100, enemy1.getHealth());
//    }
//
//    @Test
//    public void canGetDamage(){
//        assertEquals(40,axe1.getDamage());
//    }

//    @Test
//    public void canAttack(){
//        axe1.attack(enemy1);
//        assertEquals(60, enemy1.getHealth());
//    }
//
//    @Test
//    public void canTakeDamage(){
//        enemy1.takeDamage(axe1.getDamage());
//        assertEquals(60,enemy1.getHealth());
    }

//}
