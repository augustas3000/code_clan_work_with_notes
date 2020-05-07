package Enemies;


import Behaviours.ImplementationClasses.Club;

public class Orc extends FighterE {

    public Orc(int healthPoints) {
        super(healthPoints);
//        this Orc will have a Club as a weapon
        weaponInHand = new Club();
    }

//    now this orc will have an attack method based on weapon - Club

}
