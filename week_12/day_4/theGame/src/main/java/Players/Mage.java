package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Behaviours.IWeapon;
import Behaviours.ImplementationClasses.*;
import Participants.Participant;

import java.util.ArrayList;

public class Mage extends Player {

    ArrayList<IDefend> defenceList;
    ArrayList<ISpell> spellsList;

    IDefend defenceInHand;
    ISpell spellInHand;


    public Mage(String name, int healthPoints) {

        super(name, healthPoints);

        defenceList = new ArrayList<IDefend>();
        defenceList.add(new Dragon());
        defenceList.add(new Ogre());

        spellsList = new ArrayList<ISpell>();
        spellsList.add(new Fireball());
        spellsList.add(new Freeze());

    }

    public void cast(Participant opponent) {
        spellInHand.cast(opponent);
    }

    public void defend(Participant opponent) {
        defenceInHand.defend(opponent);
    }


    //    set a weapon behaviour
    public void setSpellInHand(String name) {
        ISpell spellFound = null;

        for (int spellIndex = 0; spellIndex<spellsList.size(); spellIndex++) {
            if (spellsList.get(spellIndex).getName().equals(name)) {
                spellFound = spellsList.get(spellIndex);
                this.spellInHand = spellFound;
            }
        }
    }


    public void setDefenceInHand


}
