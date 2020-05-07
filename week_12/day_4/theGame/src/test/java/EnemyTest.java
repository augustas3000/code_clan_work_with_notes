import Behaviours.IWeapon;
import Enemies.Enemy;
import Enemies.Orc;
import Enemies.Troll;
import Participants.Participant;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;


    @Before
    public void before() {
        orc = new Orc(10);
        troll = new Troll(20);

    }

    @Test
    public void hasHealth() {
        assertEquals(10,orc.getHealthPoints());
        assertEquals(20,troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(5);
        troll.takeDamage(10);
        assertEquals(5,orc.getHealthPoints());
        assertEquals(10,troll.getHealthPoints());
    }

    @Test
    public void weaponsAndDamages() {
//        System.out.println(troll instanceof Participant);
        troll.attack(orc);
        assertEquals(7, orc.getHealthPoints());



    }


}
