import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Radio", "Sony", "GG-3000");
    }


    @Test
    public void hasPropertiesInherited() {
        assertEquals("Radio", radio.getName());
        assertEquals("Sony", radio.getMake());
        assertEquals("GG-3000", radio.getModel());
    }


    @Test
    public void canTuneToStation() {
        assertEquals("The radio is now tuned to BBC4 enjoy listening!", radio.tune("BBC4"));
    }
}
