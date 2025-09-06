package basic_programs;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scan.nextInt();

        boolean isPrime = true;

        if ( num <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++){
                if ( num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println("\n" + num +" is a Prime Number.");
        }else{
            System.out.println("\n" + num + " is not a Prime Number.");
        }
        scan.close();

    }
}
