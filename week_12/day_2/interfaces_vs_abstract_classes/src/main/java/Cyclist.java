import Behaviours.ISwim;

public class Cyclist extends Athlete implements ISwim {

    public void swim(int distance) {
        this.distanceTravelled += distance;
    }

}
