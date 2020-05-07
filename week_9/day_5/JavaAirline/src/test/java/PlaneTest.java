import org.junit.Before;
import org.junit.Test;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {

        plane = new Plane(PlaneType.BOEING737,1);

    }



    @Test
    public void canRandomlySelectSeat() {
        System.out.println(plane.selectRandomSeat());
    }

}
