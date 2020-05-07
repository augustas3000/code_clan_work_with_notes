import management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import javax.management.MXBean;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Will","AA 11 11 11 A", 30000.0, "IT");
    }

    @Test
    public void canGetName() {
        assertEquals("Will", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000.0);
        assertEquals(32000.0, manager.getSalary(), 0.01);
    }

//    prevent raiseSalary if negative value given:
    @Test
    public void negativeIncrement() {
        manager.raiseSalary(-2.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.0, manager.payBonus(), 0.01);
    }


//    prebent null entry for setName

    @Test
    public void someTest() {
//        String maStr = " ";
//        System.out.println(" " instanceof String);
//        System.out.println(maStr.isEmpty());

        manager.setName(null);
        System.out.println(manager.getName());
    }

}
