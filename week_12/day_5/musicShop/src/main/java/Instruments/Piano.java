package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;



public class Piano extends Instrument implements IPlay, ISell {

    boolean hasFallBoard;
    int numPedals;

    public Piano(String material, String color, InstrumentType type, Double priceBought, Double priceSell, int numPedals, boolean hasFallBoard) {
        super(material,color,type,priceBought,priceSell);
        this.numPedals = numPedals;
        this.hasFallBoard = hasFallBoard;
    }

    public String play() {
        System.out.println("Piano playing");
        return "Piano playing";
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
