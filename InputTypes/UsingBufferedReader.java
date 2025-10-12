package InputTypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {
    public static void main(String args[]) throws IOException{

        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("\nEnter Roll Number :");
        String rollString = read.readLine();
        int roll = Integer.parseInt(rollString);

        System.out.print("\nEnter Name :");
        String name = read.readLine();

        System.out.print("\nEnter Marks :");
        String markString = read.readLine();
        double marksDouble = Double.parseDouble(markString);
        float marksFloat = Float.parseFloat(markString);

        System.out.print("\nEnter Grade :");
        String gradeString = read.readLine();
        char grade = gradeString.charAt(0);

        //Displaying results
        System.out.println("\n\nHello! " + name + "\nRoll Number : " + roll);
        System.out.print("Grade : " + grade + "\nMarks in Float : " + marksFloat);
        System.err.println("\nMarks in Double : " + marksDouble);

        read.close();
    }
    
}
