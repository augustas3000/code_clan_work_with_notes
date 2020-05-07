import Behaviours.IRun;

public class Runner extends Athlete implements IRun {

//    overriding is implementing?
    public void run(int distance) {
        this.distanceTravelled += distance;
    }

}
