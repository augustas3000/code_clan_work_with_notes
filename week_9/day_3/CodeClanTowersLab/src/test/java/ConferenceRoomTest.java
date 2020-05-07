import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom_1;

    @Before
    public void before() {
        conferenceRoom_1 = new ConferenceRoom("The Snowflake", 10);
    }

    @Test
    public void canGetcanSet() {

        assertEquals("The Snowflake", conferenceRoom_1.getName());
        assertEquals(10, conferenceRoom_1.getCapacity());
    }

}
