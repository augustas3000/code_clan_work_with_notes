package Behaviours.ImplementationClasses;

import Behaviours.IWeapon;
import Enemies.Enemy;
import Participants.Participant;
import Players.Player;

public class Sword implements IWeapon {

    int damageValue;

    String name;

    public Sword() {
        this.name = "Sword";
        this.damageValue = 5;
    }


    public void attack(Participant opponent) {


        Player opponentCastedP;
        Enemy opponentCastedE;

        if (opponent instanceof Player) {
            opponentCastedP = (Player) opponent;
            opponentCastedP.takeDamage(damageValue);
        }

        if (opponent instanceof Enemy) {
            opponentCastedE = (Enemy) opponent;
            opponentCastedE.takeDamage(damageValue);
        }

    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
