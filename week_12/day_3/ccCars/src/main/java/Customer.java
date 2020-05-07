import Behaviours.IBuy;
import Behaviours.ISell;
import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Customer extends Entity implements IBuy, ISell {

    Double money;
    ArrayList<Vehicle> ownedVehicles;

//    buyVehicle(Dealership dealership, Vehicle vehicle)
//    sellVehicle(Dealership dealership, Vehicle vehicle)
    public Customer(String name) {
        super(name);
    }

}
