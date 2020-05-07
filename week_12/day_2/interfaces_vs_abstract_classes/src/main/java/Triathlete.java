import Behaviours.IRun;
import Behaviours.ISwim;

//all types....
public class Triathlete extends Athlete implements IRun, ISwim {

    public void run(int distance) {
        this.distanceTravelled += distance;
    }

    public void swim(int dist) {
        this.distanceTravelled += dist;
    }

}
