package Players;

import Behaviours.ImplementationClasses.Axe;
import Behaviours.ImplementationClasses.Club;

public class Dwarf extends FighterP {

    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
//        this Orc will have a Club as a weapon
        weaponInHand = new Axe();
    }


}
