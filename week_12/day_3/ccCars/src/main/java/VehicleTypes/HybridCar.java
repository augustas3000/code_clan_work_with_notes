package VehicleTypes;

public class HybridCar extends Vehicle {

    String make;
    String model;
    String type;
    int year;
    Double price;

    public HybridCar(String make, String model, String type, int year, Double price) {
        super(make,model,type,year, price);
    }

}
