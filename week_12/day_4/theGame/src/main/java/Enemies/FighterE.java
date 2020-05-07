package Enemies;

import Behaviours.IWeapon;
import Behaviours.ImplementationClasses.Axe;
import Behaviours.ImplementationClasses.Club;
import Behaviours.ImplementationClasses.Sword;
import Participants.Participant;
import Players.Player;

import java.util.ArrayList;

public abstract class FighterE extends Enemy {


    IWeapon weaponInHand;
    ArrayList<IWeapon> weaponsList;

    public FighterE(int healthPoints) {
        super(healthPoints);

        weaponsList = new ArrayList<IWeapon>();
        weaponsList.add(new Axe());
        weaponsList.add(new Club());
        weaponsList.add(new Sword());
    }

    public void attack(Participant opponent) {
        weaponInHand.attack(opponent);
    }


    public void setWeaponInHand(String name) {
        IWeapon weaponFound = null;

        for (int weaponIndex = 0; weaponIndex<weaponsList.size(); weaponIndex++) {
            if (weaponsList.get(weaponIndex).getName().equals(name)) {
                weaponFound = weaponsList.get(weaponIndex);
                this.weaponInHand = weaponFound;
            }
        }
    }


    public IWeapon getWeaponInHand() {
        return weaponInHand;
    }
}
