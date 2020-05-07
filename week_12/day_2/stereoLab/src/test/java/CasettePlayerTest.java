import Components.CassettePlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CasettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void before() {
        cassettePlayer = new CassettePlayer("Casette player", "Bosh", "2223",2);
    }


    @Test
    public void hasInheritedInstVars() {
        assertEquals("Casette player", cassettePlayer.getName());
        assertEquals("Bosh", cassettePlayer.getMake());
        assertEquals("2223", cassettePlayer.getModel());
    }

    @Test
    public void canPlayARecord() {
        assertEquals("Now paying Drake - God's plan on Casette player",cassettePlayer.play("Drake - God's plan"));
    }

    @Test
    public void canPauseAndStop() {
        assertEquals("Paused", cassettePlayer.pause());
        assertEquals("Stopped", cassettePlayer.stop());
    }



}
