package basic_programs;
import java.util.Scanner;
public class Angstrong {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number :");
        int num = scan.nextInt();

        String str = Integer.toString(num);
        int length = str.length();

        int originalNum = num;
        int result = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, length);
            originalNum /= 10;
            
        }
        if(result == num){
            System.out.println("\n" + num + " is an Angstrong Number.");
        }else{
            System.out.println("\n" + num + " is not an Angstrong Number.");
        }
        scan.close();
    }    
}
