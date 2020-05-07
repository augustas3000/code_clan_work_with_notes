package Players;

import Behaviours.ImplementationClasses.Club;

public class Barbarian extends FighterP {

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
//        this Orc will have a Club as a weapon
        this.weaponInHand = new Club();
    }

}
