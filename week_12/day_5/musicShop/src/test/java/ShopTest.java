import Behaviours.ISell;
import Instruments.*;
import Items.DrumSticks;
import Items.GuitarStrings;
import Items.Metronome;
import Items.Pick;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Bass bass;
    BongoDrums bongoDrums;
    Guitar guitar;
    Harp harp;
    Piano piano;

    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Metronome metronome;
    Pick pick;

    Shop shop;


    @Before
    public void before() {

 //            instruments
        bass = new Bass("Wood","Red", InstrumentType.STRING,200.0,350.0,12);
        bongoDrums = new BongoDrums("Wood","Brown",InstrumentType.DRUMS,100.0,120.0,"Buffalo");
//Guitar class object created providing values for all inst variabkles, inherited and class specific
        guitar = new Guitar("Metal","Black",InstrumentType.STRING,280.0,
                320.0,8,10);

        harp = new Harp("Metal","Gold",InstrumentType.STRING,290.0,380.0,14,3);
        piano = new Piano("Wood","White", InstrumentType.KEYBOARD,600.0,650.0,4,true);

//        Items
        drumSticks = new DrumSticks("Drumsticks","Brown",20.00,40.00);
        guitarStrings = new GuitarStrings("Guitar strings", "Yellow",10.0,15.0);
        metronome = new Metronome("Metronome","Black",20.0,28.0);
        pick = new Pick("Pick","White",5.0,7.0);
//        shop
        shop = new Shop();
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(bass);
        assertEquals(1,shop.getStock().size());
    }

    @Test
    public void canCheckTotalProfit() {
        shop.addToStock(bass);
        shop.addToStock(bongoDrums);
        shop.addToStock(guitar);
        shop.addToStock(drumSticks);
        shop.addToStock(guitarStrings);
        shop.addToStock(metronome);
        shop.addToStock(pick);

        assertEquals(245.0,shop.totalPotentialProfit(), 0.01);
    }


}
