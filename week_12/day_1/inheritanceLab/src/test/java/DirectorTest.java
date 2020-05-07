import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Judy", "DA 11 14 12 A", 50000.0, "Sales", 300000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Judy", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("John");
        assertEquals("John", director.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000.0);
        assertEquals(52000.0, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000.0, director.payBonus(), 0.01);
    }

}
