package Items;

import Behaviours.ISell;

public class GuitarStrings extends Item implements ISell {

    public GuitarStrings(String description, String color, Double priceBought, Double priceSell) {
        super(description,color,priceBought,priceSell);
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
