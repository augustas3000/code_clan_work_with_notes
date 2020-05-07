import Behaviours.IRun;

public class Sprinter extends Athlete implements IRun {

    public void run(int dist) {
        this.runAsFastAsPossible(dist);
        this.distanceTravelled += dist;
    }

    private void runAsFastAsPossible(int dist) {
//        do shit
    }

}
