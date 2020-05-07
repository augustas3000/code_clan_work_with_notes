import Enemies.Orc;
import Enemies.Troll;
import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Dwarf dwarf;
    Knight knight;
    Barbarian barbarian;
    Orc orc;
    Troll troll;

    @Before
    public void before() {
        barbarian = new Barbarian("Woooodooo2",15);
        dwarf = new Dwarf("SyckaaaMore", 30);
        knight = new Knight("Killalot", 35);

        orc = new Orc(10);
        troll = new Troll(20);
    }

    @Test
    public void playerCanAttackEnemy() {
        barbarian.attack(orc);
        dwarf.attack(orc);
        knight.attack(orc);
        assertEquals(1,orc.getHealthPoints());
    }

    @Test
    public void enemyCanAttackPlayer() {
        orc.attack(barbarian);
        assertEquals(14, barbarian.getHealthPoints());
    }

    @Test
    public void canChangeWeaponsPlayer() {
        System.out.println(barbarian.getWeaponInHand().getName());
        barbarian.setWeaponInHand("Sword");
        System.out.println(barbarian.getWeaponInHand().getName());
    }


}
