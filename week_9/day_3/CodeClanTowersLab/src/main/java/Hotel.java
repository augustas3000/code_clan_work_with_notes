import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Hotel {

    private ArrayList<Bedroom> bedroomsHotel;
    private ArrayList<ConferenceRoom> conferenceRoomsHotel;
    private ArrayList<Booking> allBookings;

    public Hotel() {
        this.bedroomsHotel = new ArrayList<Bedroom>();
        this.conferenceRoomsHotel = new ArrayList<ConferenceRoom>();
        this.allBookings = new ArrayList<Booking>();
    }


    public void bookRoom(Bedroom bedroom, int nightsBooked) {
        if (this.isAvailable_Bedroom(bedroom)) {
            Booking newBooking = new Booking(bedroom, nightsBooked);
            this.allBookings.add(newBooking);
        }
    }

    public boolean isBooked(Bedroom bedroom) {
        for (int i=0;i<this.allBookings.size();i++) {
            if (this.allBookings.get(i).getBedroom() == bedroom) {
                return true;
            }
        }
        return false;
    }


    public void checkInGuest_Bedroom(Integer bedroomNumber, Guest guest) {

        Bedroom bedroom_found;
        bedroom_found = null;

        bedroom_found = findBedroomByNumber(bedroomNumber);

        boolean result = false;

        if (this.isAvailable_Bedroom(bedroom_found)) {
            bedroom_found.addGuest(guest);
        }

    }

    public void checkOutGuest_Bedroom(Integer bedroomNumber, Guest guest) {
        Bedroom bedroomFound = this.findBedroomByNumber(bedroomNumber);
        bedroomFound.removeGuest(guest);
    }


//    CHECK IF AVILABLE(if capacity is full)

    public boolean isAvailable_Bedroom(Bedroom bedroom) {
        if (bedroom.getRoomType().equals("Single") & bedroom.getCapacity() < 1) {
            return false;
        } else if (bedroom.getRoomType().equals("Double") & bedroom.getCapacity() < 2) {
            return false;
        } else {
            return true;
        }
    }


   public Bedroom findBedroomByNumber(Integer bedroomNum) {
        Bedroom bedroomFound;
        bedroomFound = null;

        for (int i = 0; i < this.getBedroomsHotel().size(); i++) {
            if (this.getBedroomsHotel().get(i).getRoomNumber() == bedroomNum) {
                bedroomFound = this.getBedroomsHotel().get(i);
            }
        }
        return bedroomFound;
   }


//   get bill for a particular booking;

    public double calculateTotalBillForBooking(Booking booking) {

        Double nightsBooked;
        nightsBooked = (double) booking.getNightsBooked();

        return booking.getBedroom().getNightlyRate() * nightsBooked;
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<Bedroom>();


        for (int i = 0; i < getBedroomsHotel().size(); i++) {
            Bedroom iterableBedroom = this.getBedroomsHotel().get(i);


            if (this.isAvailable_Bedroom(iterableBedroom) & !this.isBooked(iterableBedroom)) {
                vacantBedrooms.add(iterableBedroom);
            }
        }
        return vacantBedrooms;
    }





//    Add rooms

    public void addBedroom(Bedroom bedroom) {
        this.bedroomsHotel.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom confRoom) {
        this.conferenceRoomsHotel.add(confRoom);
    }



//    GETTERS

    public ArrayList<Bedroom> getBedroomsHotel() {
        return bedroomsHotel;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomsHotel() {
        return conferenceRoomsHotel;
    }

    public ArrayList<Booking> getAllBookings() {
        return allBookings;
    }

    //    SETTERS


    public void setBedroomsHotel(ArrayList<Bedroom> bedroomsHotel) {
        this.bedroomsHotel = bedroomsHotel;
    }

    public void setConferenceRoomsHotel(ArrayList<ConferenceRoom> conferenceRoomsHotel) {
        this.conferenceRoomsHotel = conferenceRoomsHotel;
    }
}
