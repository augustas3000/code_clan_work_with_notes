package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

//INHERITANCE
//Guitar class is a subclass of Instrument, inherits from Instrument the following inst vars:
//material,color,type,priceBought,priceSell, and declares and initialises two more inst vars, specific
//to this subclass: numStrings, numFrets. The inherited vars and class specific vars are passed to
//the Guitar class constructor, meaning all these var values will be required when instantiating
//objects - see the test page on the side to see how guitar object is created

//POLYMORPHISM
//The class Guitar also implements two interfaces: IPlay and ISell, from which the methods play, and
//calculateMarkup, respectively, are overriden in this class.
//Implementation of ISell will allow us to treat all objects created from classes that implement ISell,
//as of type ISell - an example of polymorphism. The application of this, is seen on the right side screen,
//where the Shop class is declared an instance variable of type ArrayList<ISell> , that will hold all
//objects of ISell type. Also attached in the next jpg, is the testing window, where a variety of stock objects
//are added to stock.
public class Guitar extends Instrument implements IPlay, ISell {

    int numStrings;
    int numFrets;
    public Guitar(String material, String color, InstrumentType type, Double priceBought,
                  Double priceSell, int numStrings, int numFrets) {
        super(material,color,type,priceBought,priceSell);
        this.numStrings = numStrings;
        this.numFrets = numFrets;
    }

    public String play() {
        System.out.println("Guitar playing");
        return "Guitar playing";
    }


    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
