import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 20);
    }

    @Test
    public void printTest() {
//        5 pages, 2 copies - will print, 10 sheets left
        printer.print(5,2);
        assertEquals(10, printer.countSheets());
    }

    @Test
    public void printTestWithToner() {
//        5 pages, 2 copies - will print, 10 sheets left, 10 toner left;

        printer.print(5,2);
//        check sheets
        assertEquals(10, printer.countSheets());
//        check toner
        assertEquals(10, printer.checkToner());
    }




//    Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.



}
