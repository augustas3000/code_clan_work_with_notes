package Items;

import Behaviours.ISell;

public class DrumSticks extends Item implements ISell {

    public DrumSticks(String description, String color, Double priceBought, Double priceSell) {
        super(description,color,priceBought,priceSell);
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
