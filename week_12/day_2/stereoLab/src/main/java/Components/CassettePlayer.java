package Components;

import Behaviours.IPlayCommands;

public class CassettePlayer extends Component implements IPlayCommands {

    int numberOfSlots;

    public CassettePlayer(String name, String make, String model,int numberOfSlots) {
        super(name, make, model);
        this.numberOfSlots = numberOfSlots;
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
