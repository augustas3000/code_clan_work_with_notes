package Components;

import Behaviours.IPlayCommands;

import java.util.ArrayList;

//implements IPlay

public class RecordDeck extends Component implements IPlayCommands {

    ArrayList<Integer> playSpeeds;

    public RecordDeck(String name, String make, String model, ArrayList<Integer> playSpeeds) {
        super(name, make, model);
        this.playSpeeds = playSpeeds;
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
