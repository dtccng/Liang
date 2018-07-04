/* Course Code: CSC164-651
   Submission Type: Lab 2 Exercise 02.14
   Due Date: 2017/01/22
   Author: Matthew Ng
   Description: The purpose of this program is to calculate the body mass.
                The user will be prompted to enter the height in pounds and
				height in inches.  The program will convert the values into
				kilograms and meters then calculate the body mass.
*/


import java.util.Scanner;

public class Exercise02_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double weightPounds = 0;
		double heightInches = 0;
		double weightKilograms;
		double heightMeters;
		final double POUND_TO_KILOGRAM = 0.45359237;
		final double INCH_TO_METER = 0.0254;
		double bmi;
	    
	    // Prompt the user to enter weight in pounds
	    System.out.print("Enter weight in pounds: ");
	    weightPounds = input.nextDouble();
	    
	    // Prompt the user to enter height in inches
	    System.out.print("Enter height in inches: ");
	    heightInches = input.nextDouble();
		
		// Convert pound and inch to kilogram and meter
		weightKilograms = weightPounds * POUND_TO_KILOGRAM;
		heightMeters = heightInches * INCH_TO_METER;
	    
		// Calculate BMI
		bmi = Math.round(weightKilograms / (heightMeters * heightMeters)) * 100 / 100.0;
	    
		// Display result
	    System.out.print("BMI is " + bmi);

	}
}
