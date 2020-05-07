import VehicleTypes.Car;
import VehicleTypes.Vehicle;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    Customer customer;
    Dealership deal;
    Vehicle car;

    @Before
    public void before() {
        customer = new Customer("Augustas");
        deal = new Dealership("Cars2k");
        car = new Car("bmw","some","standard",2000,200.00);
    }

    @Test
    public void genericTests() {




    }



}
