import org.junit.Test;

import java.util.Calendar;

public class CalendarTest {



    @Test
    public void canSomething() {

        Calendar c = Calendar.getInstance();

//        c.set(2004,0,7,15,40);
        System.out.println(c.getTimeInMillis());
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
    }


}
