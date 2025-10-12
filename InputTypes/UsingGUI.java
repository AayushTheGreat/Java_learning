package InputTypes;
import javax.swing.JOptionPane;

public class UsingGUI {
    public static void main(String args []){

        //  JOptionPane only works for the String datatypes and we need to parse it to other datatypes.

        String name = JOptionPane.showInputDialog("Enter Your Name :");
        if (name == null || name.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "User cancelled input!", "Empty message",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        int age = 0;
        boolean validInput = false;
        while(!validInput){
            String ageString = JOptionPane.showInputDialog("Enter your Age :");

            if (ageString == null){
                JOptionPane.showMessageDialog(null, "User cancelled input!", "NULL", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            
            try{
                age = Integer.parseInt(ageString);
                validInput = true;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"That's not a valid input, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }

        //  for float, double and char, use the following 
        //  float mark = Float.parseFloat(markString);
        //  char a = aString.charAt(0);
        //  double percent = Double.parseDouble(percentString);


        String message = "Hello, " + name + "! You are " + age + " years old.";

        JOptionPane.showMessageDialog(null, message, "Final Output",JOptionPane.INFORMATION_MESSAGE);

    }
}
