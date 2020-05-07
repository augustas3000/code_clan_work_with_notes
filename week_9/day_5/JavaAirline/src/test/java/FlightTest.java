import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {


    Flight flight;
    Plane planeBOEING737;

    @Before
    public void before() {

        Passenger passenger1 = new Passenger("Eric",4);
        Passenger passenger2 = new Passenger("Kyle",2);
        Passenger passenger3 = new Passenger("Kenny",1);
        Passenger passenger4 = new Passenger("Stan",3);


        planeBOEING737 = new Plane(PlaneType.BOEING737,1);

        flight = new Flight(planeBOEING737,"FRA2367",
                "FRA","GLA");

        flight.setDepartureTime(2019,0,23,16,20);

    }

    @Test
    public void canCheckNumberOfSeatsAvailable() {

        assertEquals(320,flight.numberOfAvailableSeats());

    }

    @Test
    public void canBookPassenger() {
        System.out.println(planeBOEING737.getAvailableSeats().size());
        System.out.println(planeBOEING737.getBookedSeats().size());

        System.out.println(flight.getBookedPassengers().size());
        Passenger passenger1 = new Passenger("Eric",4);
        flight.bookPassenger(passenger1);
        System.out.println(flight.getBookedPassengers().size());


        System.out.println(passenger1.getFlightNumber());
        System.out.println(passenger1.getSeatNumber());

        System.out.println(planeBOEING737.getAvailableSeats().size());
        System.out.println(planeBOEING737.getBookedSeats().size());

        assertEquals(319,flight.numberOfAvailableSeats());

    }


}
