package Items;

public abstract class Item {

    private String description;
    private String color;
    private Double priceBought;
    private Double priceSell;


    public Item(String description, String color, Double priceBought, Double priceSell) {
        this.description = description;
        this.color = color;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }


//    getters
    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public Double getPriceBought() {
        return priceBought;
    }

    public Double getPriceSell() {
        return priceSell;
    }
//    setters


    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPriceBought(Double priceBought) {
        this.priceBought = priceBought;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }
}
