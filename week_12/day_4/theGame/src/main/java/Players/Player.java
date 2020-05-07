package Players;


import Participants.Participant;

public abstract class Player extends Participant {
    String name;
    int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

//    getters


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
