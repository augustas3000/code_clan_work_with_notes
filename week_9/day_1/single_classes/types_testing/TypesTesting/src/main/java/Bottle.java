public class Bottle {
    private int volume;

    public Bottle() {
        volume = 100;
    }

    public void drink() {
        this.volume = this.volume - 10;
    }

    public int checkVolume() {
        return this.volume;
    }

    public void emptyVolume() {
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }


}

/*
Create a water bottle class with a volume property.
The volume should start at 100.
Add a drink function that takes 10 from the volume each time it is called.
Create an empty function that brings the volume down to 0.
Create a fill function that fills the volume back to 100.
 */