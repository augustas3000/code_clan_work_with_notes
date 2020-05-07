package Enemies;


import Behaviours.ImplementationClasses.Axe;

public class Troll extends FighterE {

    public Troll(int healthPoints) {
        super(healthPoints);
//        this troll will have an axe as a weapon
        weaponInHand = new Axe();

    }

}
