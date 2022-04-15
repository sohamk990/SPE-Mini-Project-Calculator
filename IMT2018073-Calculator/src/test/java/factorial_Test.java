import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class factorial_Test
{
    @BeforeClass
    public static void before_test()
    {
        System.out.println("===============================================");
        System.out.println("Starting Factorial Testing...");
        System.out.println("===============================================");
    }

    @Test
    public void zero_factorial()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 1: Factorial of zero should be 1. ");
        assertEquals("Factorial of 0 is not working correctly", new BigInteger("1"),calc.factorial(0));
    }


    @Test
    public void positive_factorial_1()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 2: Factorial should be positive. ");
        assertEquals("Factorial of positive number is not working correctly", new BigInteger("120"),calc.factorial(5));
    }

    @Test
    public void positive_factorial_2()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 3: Factorial should be positive. ");
        assertEquals("Factorial of positive number is not working correctly",new BigInteger("3628800"),calc.factorial(10));
    }

    @Test
    public void positive_factorial_3()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 4: Factorial should be positive. ");
        assertEquals("Factorial of positive number is not working correctly",new BigInteger("2432902008176640000"),calc.factorial(20));
    }

    @Test
    public void positive_factorial_4()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 5: Factorial should be positive. ");
        assertEquals("Factorial of positive number is not working correctly",new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"),calc.factorial(50));
    }

    @Test
    public void negative_factorial()
    {
        Calculator calc = new Calculator();
        System.out.println("Test Case 6: Factorial of negative numbers.");
        assertEquals("Factorial for negative numbers is not working correctly.",new BigInteger("-1"),calc.factorial(-5));
    }
}
