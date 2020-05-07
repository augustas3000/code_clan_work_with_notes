package VehicleTypes;

public class ElectricCar extends Vehicle {

    String make;
    String model;
    String type;
    int year;
    Double price;

    public ElectricCar(String make, String model, String type, int year, Double price) {
        super(make,model,type,year,price);
    }


}
