package Players;

import Behaviours.ImplementationClasses.Dragon;
import Behaviours.ImplementationClasses.Fireball;
import Behaviours.ImplementationClasses.Sword;

public class Warlock extends Mage {


    public Warlock(String name, int healthPoints) {
        super(name, healthPoints);
        defenceInHand = new Dragon();
        spellInHand = new Fireball();
    }





}
