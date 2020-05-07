package Behaviours.ImplementationClasses;

import Behaviours.ISpell;
import Enemies.Enemy;
import Participants.Participant;
import Players.Player;

public class Freeze implements ISpell {

    public void cast(Participant opponent) {
        int powerLevel = 3;

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


}
