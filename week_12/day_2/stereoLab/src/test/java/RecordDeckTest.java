import Components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        ArrayList<Integer> speeds = new ArrayList<Integer>();
        speeds.add(1);
        speeds.add(2);
        speeds.add(3);
        speeds.add(4);
        speeds.add(5);

        recordDeck = new RecordDeck("Record deck", "Pioneer", "XX2", speeds);
    }

    @Test
    public void hasInheritedInstVars() {
        assertEquals("Record deck", recordDeck.getName());
        assertEquals("Pioneer", recordDeck.getMake());
        assertEquals("XX2", recordDeck.getModel());
    }

    @Test
    public void canPlayARecord() {
        assertEquals("Now paying Drake - God's plan on Record deck",recordDeck.play("Drake - God's plan"));
    }

    @Test
    public void canPauseAndStop() {
        assertEquals("Paused", recordDeck.pause());
        assertEquals("Stopped", recordDeck.stop());
    }


}
