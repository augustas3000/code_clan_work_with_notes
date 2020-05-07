package Behaviours.ImplementationClasses;

import Behaviours.ISpell;
import Enemies.Enemy;
import Participants.Participant;
import Players.Player;

public class Fireball implements ISpell {



    int powerLevel;
    String name;

    public Fireball() {
        this.powerLevel = 4;
        this.name = "Fireball";
    }


    public void cast(Participant opponent) {


        Player opponentCastedP;
        Enemy opponentCastedE;

        if (opponent instanceof Player) {
            opponentCastedP = (Player) opponent;
            opponentCastedP.takeDamage(powerLevel);
        }

        if (opponent instanceof Enemy) {
            opponentCastedE = (Enemy) opponent;
            opponentCastedE.takeDamage(powerLevel);
        }

    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getName() {
        return name;
    }
}

