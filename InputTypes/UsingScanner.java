package InputTypes;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        //Reading an Integer
        System.out.print("\n\nInteger : ");
        int intA = scan.nextInt();

        //Reading an Double
        System.out.print("\nDouble : ");
        double doubleB = scan.nextDouble();

        //Reading a Boolean 
        System.out.print("\nEnter (true/false) : ");
        boolean myBool = scan.nextBoolean();

        //Reading a Character
        //Scanner doesn't have a nextChar()
        System.out.print("\nEnter a single Character (char) : ");
        char mychar = scan.next().charAt(0);

        //Reading a word or the whole line 
        //for a single word, use next() and for the whole line, use nextLine().
        System.out.print("\nEnter First Name : ");
        String fName = scan.next();

        scan.nextLine();//to consume the "\n generated in the next()"

        System.out.print("\nEnter Full Name : ");
        String name = scan.nextLine();


        System.out.println("\nYOUR INPUT LISTS");
        System.out.println("Integer : " + intA + " Double : " + doubleB);
        System.out.println("Boolean : " + myBool + " Character : " + mychar);
        System.out.println("First Name : " + fName + " Full Name : " + name);
        scan.close();
    }
    
}
