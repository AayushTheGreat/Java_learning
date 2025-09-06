package basic_programs;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = scan.nextInt();
        long factorial = 1; //since factorials are large values

        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("\nFactorial of "+ num + " is : "+factorial+"\n");
        scan.close();
    }
}