import Behaviours.IBuy;
import VehicleTypes.Vehicle;

import java.util.ArrayList;

public abstract class Entity {

        IBuy buyBehaviour;
        Double money;
        ArrayList<Vehicle> ownedVehicles;
        String name;

        public Entity(String name) {
            this.money = 0.0;
            ownedVehicles = new ArrayList<Vehicle>();
            this.name = name;
        }


//        public void performBuy(Dealership dealership, Vehicle car) {
//
//            buyBehaviour.buy(entity, car);
//        }
//
//
//
//        public void performSell(Customer cust, Vehicle car) {
//            buyBehaviour.sell();
//        }






        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Double getMoney() {
            return money;
        }

        public ArrayList<Vehicle> getOwnedVehicles() {
            return ownedVehicles;
        }

        public void setMoney(Double money) {
            this.money = money;
        }

        public void setOwnedVehicles(ArrayList<Vehicle> ownedVehicles) {
            this.ownedVehicles = ownedVehicles;
        }
    }



