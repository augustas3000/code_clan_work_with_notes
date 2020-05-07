import java.util.ArrayList;

public class Bedroom {

    private double nightlyRate;
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

//Double or Single


    public Bedroom(int roomNumber, String roomType) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;

        if (roomType.equals("Double")) {
            this.capacity = 2;
        } else if (roomType.equals("Single")) {
            this.capacity = 1;
        } else {
            this.capacity = 0;
        }

        this.guests = new ArrayList<Guest>();
        this.nightlyRate = 10.00;
    }

    public void addGuest(Guest guest) {
        this.capacity -= 1;
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        for (int i = 0; i < this.guests.size(); ++i) {
            if (this.guests.get(i) == guest) {
                this.guests.remove(i);

                this.capacity += 1;
            }
        }
    }


//    GETTERS
    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    //    SETTERS


    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


}
