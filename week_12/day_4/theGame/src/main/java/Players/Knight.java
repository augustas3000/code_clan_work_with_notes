package Players;

import Behaviours.ImplementationClasses.Club;
import Behaviours.ImplementationClasses.Sword;
import Enemies.Orc;

public class Knight extends FighterP {

    public Knight(String name, int healthPoints) {
        super(name, healthPoints);
        weaponInHand = new Sword();
    }

}
