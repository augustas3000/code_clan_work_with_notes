import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Alex","DA 87 46 25 B", 28000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Alex", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("John");
        assertEquals("John", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000.0);
        assertEquals(30000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280.0, developer.payBonus(), 0.01);
    }

}
