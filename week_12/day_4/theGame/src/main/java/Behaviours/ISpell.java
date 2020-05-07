package Behaviours;

import Participants.Participant;

public interface ISpell {
    public void cast(Participant opponent);
    public String getName();
    public int getPowerLevel();

}


