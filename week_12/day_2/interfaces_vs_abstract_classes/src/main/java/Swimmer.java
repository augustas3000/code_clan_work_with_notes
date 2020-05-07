import Behaviours.ISwim;

public class Swimmer extends Athlete implements ISwim {

    public void swim(int dist) {
        this.distanceTravelled += dist;
    }

}
