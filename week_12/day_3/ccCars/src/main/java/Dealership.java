import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Dealership extends Entity {

    ArrayList<Vehicle> ownedVehicles;
    Double money;

    //    buyVehicle(Customer customer, Vehicle vehicle)
    //    sellVehicle(Customer customer, Vehicle vehicle)

    public Dealership(String name) {
        super(name);
    }

}
