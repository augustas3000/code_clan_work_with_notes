import java.util.ArrayList;
import java.util.Random;

public class Plane {

    private PlaneType planeType;
    private int planeId;
    private ArrayList<String> availableSeats;
//    static ArrayList<Integer> allIDs;
    private ArrayList<String> bookedSeats;


    public Plane(PlaneType planeType, int planeId) {
        this.planeType = planeType;
        this.planeId = planeId;
        this.availableSeats = SeatGenerator.generateSeats(planeType.getCapacity());
        this.bookedSeats = new ArrayList<String>();
    }


//    select a random seat from available seats

    public String selectRandomSeat() {
        Random rand = new Random();
        return this.availableSeats.get(rand.nextInt(this.availableSeats.size()));
    }



//getters


    public ArrayList<String> getBookedSeats() {
        return bookedSeats;
    }

    public ArrayList<String> getAvailableSeats() {
        return availableSeats;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneId() {
        return planeId;
    }
//setters
    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }
}
