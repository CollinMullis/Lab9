
import javax.swing.*;
import java.text.*;

public class BMI {
	
	// Define variables for the program. 
	private static int kg = 0; // Var for Kilograms
	private static int cm = 0; // Var for Centimeters
	private double Dkg = 0.0; // Vars to show decimals
	private double Dcm = 0.0; // ==
	private static String Skg = ""; // Vars to get value from Strings
	private static String Scm = ""; // ==
	private static double bmi = 0.00;
	
	
	 public static void main(String[] args) {
		 BMI frame = new BMI();
		 
	    }
	 
	public BMI() {
		
		Skg = JOptionPane.showInputDialog(null, "Enter your Weight in Kilograms");
		kg = Integer.parseInt(Skg);
		Scm = JOptionPane.showInputDialog(null, "Enter your Height in Centigrams");
		cm = Integer.parseInt(Scm);
		Dcm = cm/100;
		bmi = kg/(Dcm*Dcm);
		DecimalFormat DF= new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null, "Your weight was: " + Skg +"\nYour height was: " + Scm + "\nYour BMI is: " + DF.format(bmi));
		
		
	}

	}
	
