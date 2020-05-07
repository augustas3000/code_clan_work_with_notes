import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Lucy","FX 27 46 35 A", 35000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Lucy", dbAdmin.getName());
    }

    @Test
    public void canSetName() {
        dbAdmin.setName("John");
        assertEquals("John", dbAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(2000.0);
        assertEquals(37000.0, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350.0, dbAdmin.payBonus(), 0.01);
    }

}
