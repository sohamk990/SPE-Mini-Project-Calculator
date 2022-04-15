import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;

public class root_Test
{
    @BeforeClass
    public static void before_test()
    {
        System.out.println("===============================================");
        System.out.println("starting square root test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float_1()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 1: Square root of a positive number");
        assertEquals("square root of 25 not working correctly",5.0,calc.root(25),1e-5);
    }

    @Test
    public void positive_float_2()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 1: Square root of a positive number");
        assertEquals("square root 3 not working correctly",1.73205,calc.root(3),1e-5);
    }

    @Test
    public void negative_float()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 3: Square root of negative number");
        assertEquals("square root -5 not working correctly",NaN,calc.root(-6),1e-5);
    }
}
