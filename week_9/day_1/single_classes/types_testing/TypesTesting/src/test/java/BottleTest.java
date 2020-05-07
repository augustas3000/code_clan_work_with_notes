import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BottleTest {

    private Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void drinkTest() {
        bottle.drink();
        assertEquals(90,bottle.checkVolume());
    }

    @Test
    public void emptyTest() {
        bottle.emptyVolume();
        assertEquals(0,bottle.checkVolume());
    }

    @Test
    public void fillTest() {
        bottle.emptyVolume();
        bottle.fillBottle();
        assertEquals(100, bottle.checkVolume());
    }

}
