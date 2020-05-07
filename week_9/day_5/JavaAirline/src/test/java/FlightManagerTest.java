import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.*;
import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane planeBOEING737;
    FlightManager flightManager;

    @Before
    public void before() {


        planeBOEING737 = new Plane(PlaneType.BOEING737, 1);

        flight = new Flight(planeBOEING737, "FRA2367",
                "FRA", "GLA");

        flight.setDepartureTime(2019, 0, 23, 16, 20);


        flightManager = new FlightManager(flight);


        Passenger passenger1 = new Passenger("Eric", 4);
        Passenger passenger2 = new Passenger("Kyle", 2);
        Passenger passenger3 = new Passenger("Kenny", 1);
        Passenger passenger4 = new Passenger("Stan", 3);

        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);

    }

    @Test
    public void canCalcBaggageAllowedPerPassenger() {

        System.out.println(flightManager.baggageWeightPerPassenger());

    }

    @Test
    public void canCheckHowMuchWeightSoFarBooked() {
        assertEquals(100, flightManager.howMuchWeightBookedSoFar(), 0.01);
    }


    @Test
    public void canCheckHowMuchWeightRemains() {
        assertEquals(6300.0, flightManager.howMuchWeightRemains(), 0.01);
    }

    @Test
    public void canGetDepartureTime() {
        System.out.println(flight.getDepartureTime());
    }


    @Test
    public void charCompare() {
        String a = "B";
        String b = "A";
        System.out.println(a.compareTo(b));
//        System.out.println(-1);

    }


    @Test
    public void canBubbleSortBookedPassengers() {

        System.out.println(flight.getBookedPassengers());
        Passenger passenger5 = new Passenger("Erica", 2);
        Passenger passenger6 = new Passenger("Kelly", 1);
        Passenger passenger7 = new Passenger("Alex", 2);

        flight.bookPassenger(passenger5);
        flight.bookPassenger(passenger6);
        flight.bookPassenger(passenger7);


        for (int i=0;i<flight.getBookedPassengers().size();i++) {
            System.out.println(flight.getBookedPassengers().get(i).getSeatNumber());
        }
        System.out.println("\n");

        flightManager.bubbleSortPassengers();
//        System.out.println(flight.getBookedPassengers());

        for (int i=0;i<flight.getBookedPassengers().size();i++) {
            System.out.println(flight.getBookedPassengers().get(i).getSeatNumber());
        }

    }

}


