import java.util.Scanner;

public class Milk
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of litres of milk that was produced: ");
        double milk_litres = scan.nextDouble();
        double jugs_num = milk_litres/0.75;
        System.out.println("The number of jugs produced is " + (int)(jugs_num));
    }
}