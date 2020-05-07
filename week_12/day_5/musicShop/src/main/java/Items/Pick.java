package Items;

import Behaviours.ISell;

public class Pick extends Item implements ISell {

    public Pick(String description, String color, Double priceBought, Double priceSell) {
        super(description,color,priceBought,priceSell);
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBought();
    }

}
