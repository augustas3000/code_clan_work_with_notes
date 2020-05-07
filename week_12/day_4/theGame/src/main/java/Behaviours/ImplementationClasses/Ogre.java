package Behaviours.ImplementationClasses;

import Behaviours.IDefend;
import Behaviours.IWeapon;
import Enemies.Enemy;
import Enemies.FighterE;
import Participants.Participant;
import Players.FighterP;
import Players.Player;

public class Ogre implements IDefend {

    public void defend(Participant opponent) {

            Double percentageDamage = 0.3;
            int damageToGiveBack;
            FighterP opponentCastedP;
            FighterE opponentCastedE;

            if (opponent instanceof Player) {
                opponentCastedP = (FighterP) opponent;


                IWeapon weaponused = opponentCastedP.getWeaponInHand();
                int opponentsDamage = weaponused.getDamageValue();

                damageToGiveBack = (int) (opponentsDamage * percentageDamage);

                opponentCastedP.takeDamage(damageToGiveBack);
            }

            if (opponent instanceof Enemy) {
                opponentCastedE = (FighterE) opponent;

                IWeapon weaponused = opponentCastedE.getWeaponInHand();
                int opponentsDamage = weaponused.getDamageValue();

                damageToGiveBack = (int) (opponentsDamage * percentageDamage);

                opponentCastedE.takeDamage(damageToGiveBack);

            }

        }
    }


