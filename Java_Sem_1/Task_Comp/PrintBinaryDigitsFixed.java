import java.util.Scanner;
public class PrintBinaryDigitsFixed
{
    static void printBackwardsFrom(int n) {
        int temp, digit, count=0;
        temp = n;
        while(n>0){  
        n=n/10;
        count++;  
        }  
          
        while(temp > 0){  
        digit=temp%10;   
        System.out.println(digit);  
        temp=temp/10;  
        count--;  
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
        int[] digits = new int[30];
        
        System.out.println("Enter integer from "+min+" to "+max+": ");
        int number = scan.nextInt();
        
        readInteger(number);
        readInput(number,min,max);
        
        printBackwardsFrom(number);
        
        
    }
}
