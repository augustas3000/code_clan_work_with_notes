public class Booking {
    private Bedroom bedroom;
    private int nightsBooked;


    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;

    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }
}
