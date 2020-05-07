import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;


    public Bear(String name) {
        this.belly = new ArrayList<Salmon>();
        this.name = name;
    }
    public int foodCount() {
        return belly.size();
    }

    public void eatFishFromRiver(River river) {

        belly.add(river.removeSalmon());

//        this.belly.add(salmon);
    }

    public void sleep() {
        belly.clear();
    }

}
