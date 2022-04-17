import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class power_Test
{
    @BeforeClass
    public static void before_test()
    {
        System.out.println("===============================================");
        System.out.println("starting power test");
        System.out.println("===============================================");
    }
    @Test
    public void positive_and_positive()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 1: Power of positive and positive numbers");
        assertEquals("power of 2 and 3 is not working correctly",8,calc.power(2, 3),0.00001);
    }
    @Test
    public void positive_and_negative()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 2: Power of positive and negative numbers");
        assertEquals("power of -2 and 3 is not working correctly",8,calc.power(0.5, -3),0.00001);
    }
    @Test
    public void negative_and_positive()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 3: Power of negative and positive numbers");
        assertEquals("power of -0.5 and -3 is not working correctly",-8,calc.power(-2, 3),0.00001);
    }
    @Test
    public void negative_and_negative()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 4: Power of negative and negative numbers");
        assertEquals("power of -0.5 and -3 is not working correctly",-8,calc.power(-0.5, -3),0.00001);
    }
}
