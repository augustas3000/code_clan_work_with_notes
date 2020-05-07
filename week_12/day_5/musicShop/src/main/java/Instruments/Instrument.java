package Instruments;

//INHERITANCE - superclass instrument is abstract, declares inst variable and methods, which will be
//inherited by classes like Guitar.
public abstract class Instrument{

    String material;
    String color;
    InstrumentType  type;
    Double priceBought;
    Double priceSell;

    public Instrument(String material, String color, InstrumentType type, Double priceBought, Double priceSell) {
        this.material = material;
        this.color = color;
        this.type = type;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }


//    getters


    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getType() {
        return type;
    }

    public Double getPriceBought() {
        return priceBought;
    }

    public Double getPriceSell() {
        return priceSell;
    }

//    setters


    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public void setPriceBought(Double priceBought) {
        this.priceBought = priceBought;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }
}
