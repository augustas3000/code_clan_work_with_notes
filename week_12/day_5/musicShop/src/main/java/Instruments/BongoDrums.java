package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class BongoDrums extends Instrument implements IPlay, ISell {

    String skinType;

    public BongoDrums(String material, String color, InstrumentType type, Double priceBought, Double priceSell, String skinType) {
        super(material,color,type,priceBought,priceSell);
        this.skinType = skinType;
    }

    public String play() {
        System.out.println("Bongos playing");
        return "Bongos playing";
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
