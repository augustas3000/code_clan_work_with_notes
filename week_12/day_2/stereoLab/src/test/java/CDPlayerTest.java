import Components.CDPlayer;
import Components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {


    CDPlayer cdPlayer;

    @Before
    public void before() {

        cdPlayer = new CDPlayer("CD Player", "Acme", "2000K", 5);
    }

    @Test
    public void hasInheritedInstVars() {
        assertEquals("CD Player", cdPlayer.getName());
        assertEquals("Acme", cdPlayer.getMake());
        assertEquals("2000K", cdPlayer.getModel());
    }

    @Test
    public void canPlayARecord() {
        assertEquals("Now paying 2pac CD on CD Player",cdPlayer.play("2pac CD"));
    }

    @Test
    public void canPauseAndStop() {
        assertEquals("Paused", cdPlayer.pause());
        assertEquals("Stopped", cdPlayer.stop());
    }



}
