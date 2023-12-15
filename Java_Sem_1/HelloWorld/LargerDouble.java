import java.util.Scanner;

public class LargerDouble
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two decimal numbers separated by one or more spaces");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("The larger integer is " + Math.max(a, b));
    }
}