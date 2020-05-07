package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;


public class Harp extends Instrument implements IPlay {

    int numStrings;
    int numPedals;

    public Harp(String material, String color, InstrumentType type, Double priceBought, Double priceSell, int numStrings, int numPedals) {
        super(material,color,type,priceBought,priceSell);
        this.numStrings = numStrings;
        this.numPedals = numPedals;
    }


    public String play() {
        System.out.println("Harp playing");
        return "Harp playing";
    }

//    public Double calculateMarkup() {
//        return this.getPriceSell() - this.getPriceBought();
//    }

}
