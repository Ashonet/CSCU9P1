import java.util.Scanner;
public class PrintBinaryDigitsFixed2
{
    static void printBackwardsFrom(String[] digits) {
        System.out.print("Here is the reversed integer: ");
        for (int i = digits.length-1; i >= 0; i--) {  
            System.out.print(digits[i] + "");  
        }  
    }
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
    static void readInput(int num, int min, int max) {
        if(num>=min && num<=max){  
            System.out.println("Number meets required parameters.");  
        }  
        else if(num<min){  
            System.out.println("Number doesn't meet required parameters.");  
        }     
        else{  
            System.out.println("Number doesn't meet required parameters.");  
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int min = 0;
        final int max = (int) (Math.pow(2,30)-1);
        
        System.out.println("Enter integer from "+min+" to "+max+": ");
        int number = scan.nextInt();
        String[] digits = String.valueOf(number).split("");
        
        readInteger(number);
        readInput(number,min,max);
        printBackwardsFrom(digits);
    }
}
