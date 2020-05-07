import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest newGuest;

    @Before
    public void before() {
        newGuest = new Guest("John");

    }

    @Test
    public void canGetcanSet() {

        assertEquals("John", newGuest.getName());
        newGuest.setName("Lynda");
        assertEquals("Lynda", newGuest.getName());

    }
}
