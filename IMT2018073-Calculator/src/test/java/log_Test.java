import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;

public class log_Test
{
    @BeforeClass
    public static void before_test()
    {
        System.out.println("===============================================");
        System.out.println("starting log test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 1: Natural log of a positive number");
        assertEquals("log 10 not working correctly",2.3025851,calc.log(10),1e-5);
    }

    @Test
    public void negative_float()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 2: Natural log of a negative number");
        assertEquals("log -10 not working correctly",NaN,calc.log(-6),1e-5);
    }
}
