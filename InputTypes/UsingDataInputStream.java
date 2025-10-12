package InputTypes;
import java.io.*;

public class UsingDataInputStream {
    public static void main (String args[]) throws IOException{


        FileOutputStream fileOut = new FileOutputStream("student.dat");
        DataOutputStream dataOut = new DataOutputStream(fileOut);

        //--- 1. Writing data in binary format
        dataOut.writeInt(191);
        dataOut.writeUTF("AayushTheGreat");
        dataOut.writeDouble(34.4);

        dataOut.close();
        System.out.println("Data saved to student.dat");

        // --- 2. Read the binary data back using DataInputStream ---
        FileInputStream fileIn = new FileInputStream("student.dat");
        DataInputStream dataIn = new DataInputStream(fileIn);

        // You must read the data in the EXACT same order it was written
        int roll = dataIn.readInt();
        String name = dataIn.readUTF();
        double marks = dataIn.readDouble();

        dataIn.close();

        // --- 3. Display the results ---
        System.out.println("\n--- Data read from file ---");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        // InputStream input = System.in;
        // DataInputStream streamReader = new DataInputStream(input);

        // System.out.print("\nEnter Roll Number :");
        // int roll = streamReader.readInt();

        // System.out.print("\nEnter Name :");
        // String name = streamReader.readUTF();

        // System.out.print("\nEnter Marks :");
        // float marksFloat = streamReader.readFloat();
        // double marksDouble = streamReader.readDouble();

        // System.out.print("\nEnter Grade :");
        // char grade = streamReader.readChar();

        // System.out.print("\nEnter Status(true/false) :");
        // boolean status = streamReader.readBoolean();

        // // Displaying results
        // System.out.println("\n\nHello! " + name + "\nRoll Number : " + roll);
        // System.out.print("Grade : " + grade + "\nMarks in Float : " + marksFloat);
        // System.err.println("\nMarks in Double : " + marksDouble);
        // System.out.println("\nStatus : " + status);

        // streamReader.close();
    }
}


// The Reason: Binary vs. Text Data 
// DataInputStream is designed to read binary data, not human-readable text.

// What you type (Text): When you type the number 101 into the console, you are sending a sequence of characters: '1', '0', and '1'.

// What readInt() expects (Binary): The readInt() method does not look for characters. It expects 4 raw bytes of binary data that represent the integer 101 in memory.

// It's like trying to read a book using a barcode scanner. The scanner sees the raw shapes of the letters but has no idea how to interpret them as words. It's the wrong tool for the job.