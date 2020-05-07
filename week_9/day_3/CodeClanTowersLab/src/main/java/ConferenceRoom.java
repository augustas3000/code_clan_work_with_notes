import java.util.ArrayList;

public class ConferenceRoom {
    String name;
    int capacity;
    ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity ) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

//    GETTERS
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

//    SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }




}
