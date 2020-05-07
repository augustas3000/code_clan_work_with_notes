
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before()
    {
        calculator = new Calculator();
    }


    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void canDivide() {
        assertEquals(4.5, calculator.divide(9.0,2.0), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    public void canMultiply() {
        assertEquals(16, calculator.multiply(4, 4));
    }

//    public class BearTest{
//        @Test
//        public void hasName(){
//            Bear bear = new Bear("Baloo");
//            assertEquals( "Baloo", bear.getName() );
//        }
//    }




}


/*
We need to import both the junit testing package and also the
AssertEquals function. The classes we want to test also need to
be available to this file, just like require_relative in Ruby.
In this case we’ll have all the files in the same directory so we
don’t need to do anything, but when we come to packaging up our
classes we need to make sure they’re imported.

Each test should be started by writing ‘@Test’.
(This tells JUnit to run the following function as a test,
so if any exceptions are thrown the test fails - this is a
Java annotation, which can be used for a range of things,
not just testing).

We then write a function which returns void and has a name
descriptive of what is being tested.


  public class BearTest{
    @Test
    public void hasName(){
      Bear bear = new Bear("Baloo");
      assertEquals( "Baloo", bear.getName() );
    }
  }

 */