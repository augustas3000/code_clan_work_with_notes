package VehicleTypes;

public abstract class Vehicle {

    String make;
    String model;
    String type;
    int year;
    Double price;

    public Vehicle(String make, String model, String type, int year, Double price)  {
        this.make = make;
        this.model = model;
        this.type = type;
        this.year = year;
        this.price = price;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
