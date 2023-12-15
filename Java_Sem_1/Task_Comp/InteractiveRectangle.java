import java.util.Scanner;
public class InteractiveRectangle {
    static void perimiter(int length, int height) {
        int per = (length*2)+(height*2);
    
        System.out.println("The perimeter of the rectangle is: " + per);
    }
    static void area(int length, int height) {
        int area = length*height;
    
        System.out.println("The area of the rectangle is: " + area);
    }
    /*
     * 
     */
    static boolean readInteger(int num) {
        String integer = Integer.toString(num);
        for (int i = 0; i < integer.length(); i++){
            if (Character.isDigit(integer.charAt(i)) == false){
                System.out.println("Number is not an integer.");
                return false;
            }
            System.out.println("Number is an integer.");
            return true;
        }
        return true;
    }
    static void readPositiveInteger(int num) {
        if(num>0){  
            System.out.println("Number is positive.");  
        }  
        else if(num<0){  
            System.out.println("Number is negative.");  
        }     
        else{  
            System.out.println("Number is zero.");  
        }
    }
    static void printRectangleDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        int height = scan.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = scan.nextInt();
            
        perimiter(length, height);
        area(length, height);
        System.out.println("Height: "+ readInteger(height));
        System.out.println("Length: "+ readInteger(length));
        System.out.println("Height: ");
        readPositiveInteger(height);
        System.out.println("Length:");
        readPositiveInteger(length);
    }
    static boolean keepGoing(boolean valid) {
        Scanner scan = new Scanner(System.in);
        while(valid == true){
            System.out.println("Would you like to start the program (1=yes, 0=no): ");
            int yRec = scan.nextInt();
            if(yRec == 1){
                printRectangleDetails();
            }else if(yRec == 0){
                valid = false;
            }
        }
        return valid;
    }
    public static void main(String[] args) {
        keepGoing(true);
    }
}
