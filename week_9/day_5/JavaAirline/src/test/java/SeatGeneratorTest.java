import org.junit.Test;

import java.util.ArrayList;

public class SeatGeneratorTest {


    @Test
    public void canGenerateSeats() {


        ArrayList<String> seats = SeatGenerator.generateSeats(200);
        System.out.println(seats);
    }



}
