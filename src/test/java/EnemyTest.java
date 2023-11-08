import org.junit.Before;
import Enemy.Orc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Orc enemy1;
    Axe axe1;
    @Before
    public void before(){
        Orc enemy1 = new Orc(100);
        Axe axe1 = new Axe(40);
    }

    @Test
    public void canAttack(){
        assertEquals(,);
    }

    @Test
    public void canTakeDamage(){
        assertEquals(,);
    }

}
