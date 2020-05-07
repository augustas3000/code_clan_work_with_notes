package VehicleTypes;

public class Car extends Vehicle {

    String make;
    String model;
    String type;
    int year;
    Double price;

    public Car(String make, String model, String type, int year, Double price) {
        super(make,model,type,year,price);
    }

}
