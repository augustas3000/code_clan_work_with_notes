import java.util.ArrayList;

public class SeatGenerator {

    public static ArrayList<String> generateSeats(int capacity) {

        ArrayList<String> generatedSeats = new ArrayList<String>();

        String seatsLetters ="ABCDEF";
        int counterSeats = 0;
        int counterSixSeats = 1;
        String resultingSeatString = "";


        while (counterSeats <= capacity) {

            for (int letterPosition = 0; letterPosition < seatsLetters.length(); letterPosition++ ) {
                if (counterSeats <= capacity) {

                    String letter = String .valueOf(seatsLetters.charAt(letterPosition));
                    resultingSeatString = counterSixSeats + letter;
                    generatedSeats.add(resultingSeatString);
                    counterSeats++;
                } else {
                    break;
                }
            }
            counterSixSeats++;
        }

        return  generatedSeats;

    }

}
