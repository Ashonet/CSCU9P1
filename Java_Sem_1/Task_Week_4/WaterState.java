import java.util.Scanner;
public class WaterState
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature of water in Cº: ");
        double waterTemp = scan.nextDouble();
        System.out.println("Enter the altitude (meters) of where the water is situated: ");
        double waterAltitude = scan.nextDouble();
        
        double finalTemp = waterTemp - (waterAltitude/300); 
        double boilingTemp = 100 - (waterAltitude/300);
    
        
        if(waterTemp<0)
        {
            System.out.println("The waters state is currently ice, due to its temperature being: " + (int)(finalTemp) +" degrees Cº");
        }else if(waterTemp>=0 && finalTemp<=boilingTemp)
        {
            System.out.println("The waters state is currently liquid, due to its temperature being: " + (int)(finalTemp) +" degrees Cº");
        }else
        {
            System.out.println("The waters state is currently steam, due to its temperature being: " + (int)(finalTemp) +" degrees Cº");
        }
    }
}
