package basic_programs;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = scan.nextLine();

        String revString = new StringBuilder(str).reverse().toString();

        if (str.equals(revString)){
            System.out.println("\n" + str + " is a Palindrome.");
        }else{
            System.out.println("\n" + str + " is not a Palindrome.");
        }
        scan.close();
    }
}
