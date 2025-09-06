package basic_programs;
import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number : ");
        int num = scan.nextInt();

        if( num % 2 == 0){
            System.out.println("\n" + num + " is Even.");
        }else{
            System.out.println("\n" + num + " is Odd.");
        }
        scan.close();
    }
    
}
