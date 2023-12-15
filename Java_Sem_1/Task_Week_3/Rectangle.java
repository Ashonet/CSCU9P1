import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length and width of the Rectangle: ");
        double height = scan.nextDouble();
        double width = scan.nextDouble();
        
        double perimiter = (height*2) + (width*2);
        double area = height * width;
        double diagonal_length = Math.sqrt((width*width) + (height*height));
        
        System.out.println("The Perimiter is: " + perimiter);
        System.out.println("The Area is: " + area);
        System.out.println("The Diagonal length of the rectangle is: " + diagonal_length);
    }
}