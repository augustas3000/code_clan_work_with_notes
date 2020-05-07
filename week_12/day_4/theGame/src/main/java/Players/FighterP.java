package Players;

import Behaviours.IWeapon;
import Behaviours.ImplementationClasses.Axe;
import Behaviours.ImplementationClasses.Club;
import Behaviours.ImplementationClasses.Sword;
import Enemies.Enemy;
import Participants.Participant;

import java.util.ArrayList;

public abstract class FighterP extends Player {

    ArrayList<IWeapon> weaponsList;
    IWeapon weaponInHand;

    //Weapon - instacne of axe club or sword


    public FighterP(String name, int healthPoints) {

        super(name, healthPoints);

        weaponsList = new ArrayList<IWeapon>();
            weaponsList.add(new Axe());
            weaponsList.add(new Club());
            weaponsList.add(new Sword());
   }

    public void attack(Participant opponent) {
        weaponInHand.attack(opponent);
    }


//    set a weapon behaviour
    public void setWeaponInHand(String name) {
        IWeapon weaponFound = null;

        for (int weaponIndex = 0; weaponIndex<weaponsList.size(); weaponIndex++) {
            if (weaponsList.get(weaponIndex).getName().equals(name)) {
                weaponFound = weaponsList.get(weaponIndex);
                this.weaponInHand = weaponFound;
            }
        }
    }

//  getter

    public IWeapon getWeaponInHand() {
        return weaponInHand;
    }

    public ArrayList<IWeapon> getWeaponsList() {
        return weaponsList;
    }
}