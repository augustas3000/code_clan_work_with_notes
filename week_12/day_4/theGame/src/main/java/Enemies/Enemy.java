package Enemies;


import Participants.Participant;

public abstract class Enemy extends Participant {
    int healthPoints;
    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }


    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }


//    getters
    public int getHealthPoints() {
        return healthPoints;
    }

//    setters
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

}
