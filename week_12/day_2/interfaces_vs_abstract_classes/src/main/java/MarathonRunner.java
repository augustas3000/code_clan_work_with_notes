import Behaviours.IRun;

public class MarathonRunner extends Athlete implements IRun {
//    implement run from impelmented interface
    public void run(int dist) {
        this.runAtMarathonPace(dist);
        this.distanceTravelled += dist;
    }

    private void runAtMarathonPace(int dist) {
//        do shit
    }

}
