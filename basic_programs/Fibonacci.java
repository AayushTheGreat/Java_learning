package basic_programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int num = scan.nextInt();

        int a = 0, b = 1;

        System.out.print("\nFibonacci Series: " + a + " " + b);

        for(int i = 2; i < num; i++){
            int next = a + b;
            System.out.print(" " + next);

            a = b;
            b = next;
        }
        scan.close();
    }
    
}
