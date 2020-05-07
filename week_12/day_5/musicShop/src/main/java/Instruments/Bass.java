package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Bass extends Instrument implements IPlay, ISell {

    int numStrings;

    public Bass(String material, String color, InstrumentType type, Double priceBought, Double priceSell, int numStrings) {
        super(material,color,type,priceBought,priceSell);
        this.numStrings = numStrings;
    }

    public String play() {
        System.out.println("Bass playing");
        return "Bass playing";
    }


    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }


}
