import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void canPrint(){
//        System.out.println(printer.getClass());
        assertEquals("printing: Hello World", printer.print("Hello World"));
    }

    @Test
    public void canConnect() {
        assertEquals("connecting to network: Codeclan", printer.connect("Codeclan"));

    }

}
