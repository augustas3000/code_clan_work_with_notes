import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class FlightManager {

//    int baggagePerPassenger;
//    int weightPerBaggage;
    private Flight flight;
//    private int totalBaggageAllowance;
    private double avgBagWeight;


    public FlightManager(Flight flight) {
        this.flight = flight;
        this.avgBagWeight = 10.00;
    }

    public double baggageWeightPerPassenger() {

        double totalBagageAllowance = (double) flight.plane.getPlaneType().getTotalBaggageAllowance();
        return totalBagageAllowance / flight.plane.getPlaneType().getCapacity();

    }

    public double howMuchWeightBookedSoFar() {
//        booked passengers bags * bag weight;

        ArrayList<Passenger> bookedPassengers =  flight.getBookedPassengers();
        double totalWeight = 0.0;

        for (int passengerIndex = 0; passengerIndex < bookedPassengers.size(); passengerIndex++) {
            totalWeight += bookedPassengers.get(passengerIndex).getNumberOfBags() * avgBagWeight;
        }

        return totalWeight;
    }

    public double howMuchWeightRemains() {
        return flight.plane.getPlaneType().getTotalBaggageAllowance() - howMuchWeightBookedSoFar();
    }



    public void bubbleSortPassengers() {

        ArrayList<Passenger> bookedPassengers = this.flight.getBookedPassengers();

//        ArrayList<Passenger> sortedByLetter = new ArrayList<Passenger>();
//
        for (int passengerIndex = 0; passengerIndex < bookedPassengers.size(); passengerIndex++) {
            for (int j = 0; j < bookedPassengers.size() - 1; j++){

                ArrayList<String> seatNumberSplit1 = this.stringProcess(bookedPassengers.get(j).getSeatNumber());
                ArrayList<String> seatNumberSplit2 = this.stringProcess(bookedPassengers.get(j+1).getSeatNumber());

                if (seatNumberSplit1.get(1).compareTo(seatNumberSplit2.get(1)) >= 1) {
                    Passenger temp = bookedPassengers.get(j);

                    bookedPassengers.set(j, bookedPassengers.get(j+1));
                    bookedPassengers.set(j + 1, temp);

                } else if (seatNumberSplit1.get(1).compareTo(seatNumberSplit2.get(1)) == 0) {

                    if (parseInt(seatNumberSplit1.get(0)) > parseInt(seatNumberSplit2.get(0))) {

                        Passenger temp = bookedPassengers.get(j);

                        bookedPassengers.set(j, bookedPassengers.get(j+1));
                        bookedPassengers.set(j + 1, temp);
                    }
                }
            }
        }
    }


//    helper split numbers and letters for sort

    public ArrayList<String> stringProcess(String string) {

        Matcher matcher = Pattern.compile("^(\\d+)(\\w+)").matcher(string);
        String firstpart = "";
        String secondPart = "";

        if (matcher.find()) {
            firstpart = matcher.group(1);
            secondPart = matcher.group(2);
        }

        ArrayList<String> result = new ArrayList<String>();

        result.add(firstpart);
        result.add(secondPart);

        return  result;

    }



}
