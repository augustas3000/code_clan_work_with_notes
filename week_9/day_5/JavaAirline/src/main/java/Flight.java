import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Flight {

    Plane plane;
    ArrayList<Passenger> bookedPassengers;
    String flightNumber;
    String destination;
    String departingFrom;
//    change to date type later on
    Calendar departureTime;



    public Flight(Plane plane, String flightNumber,
                  String destination, String departingFrom) {

        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingFrom = departingFrom;
        this.departureTime = null;
        this.bookedPassengers = new ArrayList<Passenger>();

    }


//    set departure time
    public void setDepartureTime(int year, int month, int day, int hour, int minute) {
        this.departureTime = Calendar.getInstance();
        this.departureTime.set(year,month,day,hour,minute);
    }

//    get departure time

    public Date getDepartureTime() {

        return this.departureTime.getTime();
    }



    public int numberOfAvailableSeats() {
        int totalCapacity = this.plane.getPlaneType().getCapacity();
        int seatsBookedSoFar = this.bookedPassengers.size();

        return totalCapacity - seatsBookedSoFar;

    }


    public void bookPassenger(Passenger passenger) {
//        check if not in the list of booked passengers
        if (!bookedPassengers.contains(passenger)) {
            this.bookedPassengers.add(passenger);

            String randomSeatNumber = plane.selectRandomSeat();
            int randomSeatnumberIndex = plane.getAvailableSeats().indexOf(randomSeatNumber);
            plane.getBookedSeats().add(randomSeatNumber);
            plane.getAvailableSeats().remove(randomSeatnumberIndex);

            passenger.setFlightNumber(flightNumber);
            passenger.setSeatNumber(randomSeatNumber);

        }

    }


//    getters


    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

//    public String getDepartureTime() {
//        return departureTime;
//    }

//    setters


    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setBookedPassengers(ArrayList<Passenger> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartingFrom(String departingFrom) {
        this.departingFrom = departingFrom;
    }

//    public void setDepartureTime(String departureTime) {
//        this.departureTime = departureTime;
//    }
}
