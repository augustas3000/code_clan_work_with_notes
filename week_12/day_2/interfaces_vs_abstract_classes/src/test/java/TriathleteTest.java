import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriathleteTest {

    Triathlete triathlete;

    @Before
    public void before() {
        triathlete = new Triathlete();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, triathlete.getDistanceTravelled());
    }


    @Test
    public void canRun() {
        triathlete.run(10);
        assertEquals(10, triathlete
                .getDistanceTravelled());
    }


    @Test
    public void canSwim() {
        triathlete.run(10);
        triathlete.swim(10);
        assertEquals(20, triathlete
                .getDistanceTravelled());
    }
}
