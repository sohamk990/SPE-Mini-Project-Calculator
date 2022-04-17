import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    static BigInteger factorial(int N)
    {
        logger.info("[FACTORIAL] - " + N);
        BigInteger res;
        if(N<0)
        {
            logger.error("factorial function does not work with negative number");
            res = new BigInteger("-1");
        }
        else
        {
            res = new BigInteger("1");
            for (int i = 1; i <= N; i++)
            {
                res = res.multiply(BigInteger.valueOf(i));
            }
        }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }

    static double root(double n)
    {
        logger.info("[SQRT] - " + n);
        if(n < 0)
        {
            logger.error("square root function is given negative number");
        }

        double res = Math.sqrt(n); ;
        logger.info("[RESULT - SQUARE ROOT] - " + n);
        return res;
    }

    static double log(double n)
    {
        double res;
        logger.info("[LOG] - " + n);
        if(n < 0)
        {
            logger.error("natural log function does not work with negative number");
            res = -1;
        }
        res = Math.log(n);
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }

    static double power(double x, double y)
    {
        double res = Math.pow(x, y);
        logger.info("[POWER] - " + x + ", " + y);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose the operation");
        System.out.println("1) Square Root");
        System.out.println("2) Factorial");
        System.out.println("3) Natural Logarithm (base e)");
        System.out.println("4) Power (x^y)");
        System.out.print("Enter the Operation: ");

        int op = scan.nextInt();

        if(op==1)
        {
            System.out.print("Enter the Number: ");
            double x = scan.nextDouble();
            System.out.println("Square Root of " + x + " is: " + root(x));
        }
        else if(op==2)
        {
            System.out.print("Enter the Number: ");
            int n = scan.nextInt();
            System.out.println("Factorial of " + n + " is: " + factorial(n));
        }
        else if(op==3)
        {
            System.out.print("Enter the Number: ");
            double x = scan.nextDouble();
            System.out.println("Natural log of " + x + " is: " + log    (x));
        }
        else if(op==4)
        {
            double x,y;

            System.out.print("Enter First Number(x): ");
            x = scan.nextDouble();

            System.out.print("Enter Second Number(y): ");
            y = scan.nextDouble();

            System.out.println("Power of " + x + " raised to " + y + " is: " + power(x,y));

        }
        else
        {
            logger.error("[ERROR] - wrong option selected");
            System.out.println("WRONG OPTION IS SELECTED !!!");
        }
    }
}
