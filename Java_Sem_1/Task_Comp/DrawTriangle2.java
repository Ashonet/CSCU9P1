import java.util.Scanner;
public class DrawTriangle2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int k = 0, max = 20, min = 1;
    boolean valid = true;
    
    while(valid == true){
        System.out.println("Would you like for the program to show you a triangle (1=yes, 0=no): ");
        int yTriangle = scan.nextInt();
        if(yTriangle == 1){
            int range = (max - min) + 1;
            int height = (int)((range * Math.random()) + min);
            for (int i = 1; i <= height; ++i, k = 0) {
                for (int space = 1; space <= height - i; ++space) {
                    System.out.print("  ");
                }
    
                while (k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }
            System.out.println();
            }
            
        }else if(yTriangle == 0){
            valid = false;
        }
    }
    System.out.println("Program has ended");
  }
}