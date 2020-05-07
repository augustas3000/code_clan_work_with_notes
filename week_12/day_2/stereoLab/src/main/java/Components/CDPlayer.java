package Components;

import Behaviours.IPlayCommands;

import java.util.ArrayList;

public class CDPlayer extends Component implements IPlayCommands {

    int numberOfCDs;

    public CDPlayer(String name, String make, String model, int numberOfCDs) {
        super(name, make, model);
        this.numberOfCDs = numberOfCDs;
    }


    public String play(String song) {
        return "Now paying " + song + " on " + this.getName();
    }

    public String stop() {
        return "Stopped";
    }


    public String pause() {
        return "Paused";
    }


}
