import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1_Double;
    Bedroom bedroom2_Single;
    Bedroom bedroom3_NULL;

    @Before
    public void before() {
        bedroom1_Double = new Bedroom(1, "Double");
        bedroom2_Single = new Bedroom(2,"Single");
        bedroom3_NULL = new Bedroom(3,"Something");
    }

    @Test
    public void canGetcanSet_roomTypesLegit() {
//        double bedroom
        assertEquals(2, bedroom1_Double.getCapacity());
        assertEquals(0, bedroom1_Double.getGuests().size());
        assertEquals(1, bedroom2_Single.getCapacity());
        assertEquals(0, bedroom3_NULL.getCapacity());
    }


}
