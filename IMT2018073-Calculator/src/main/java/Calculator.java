import java.math.BigInteger;
import java.util.Scanner;

public class Calculator
{
    static BigInteger factorial(int N)
    {
        BigInteger res;
        if(N<0)
        {
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
        return res;
    }

    static double root(double n)
    {
        double res;
        res = Math.sqrt(n);
        return res;
    }

    static double loge(double n)
    {
        double res;
        res = Math.log(n);
        return res;
    }

    static double power(double x, double y)
    {
        double res;
        res = Math.pow(x, y);
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
            System.out.println("Natural log of " + x + " is: " + loge(x));
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
            System.out.println("WRONG OPTION IS SELECTED !!!");
        }
    }
}
