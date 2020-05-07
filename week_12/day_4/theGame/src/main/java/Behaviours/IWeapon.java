package Behaviours;

import Participants.Participant;

public interface IWeapon {
    public void attack(Participant opponent);
    public String getName();
    public int getDamageValue();
}
