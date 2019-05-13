// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;

// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/*
Program name: NumericTypes.java
Description: This program demonstrates how numeric types and
 operators behave in Java.
Inputs: NA
Output: Print message to standard output.
Preconditions: NA
Postconditions: NA
*/

public class NumericTypes 
{
	public static void main (String [] args)
	{
		// TASK #2 Create a Scanner object here
		// (not used for alternate)   
		Scanner keyboard = new Scanner(System.in);
	      
		// Identifier declarations
		final int NUMBER = 2 ; 			// Number of scores
		final int SCORE1 = 100; 		// First test score
		final int SCORE2 = 95; 			// Second test score
		final int BOILING_IN_F = 212; 	// Boiling temperature
		double fToC; 					// Temperature Celsius
		double average; 				// Arithmetic average
		String output; 					// Line of output 
		// TASK #2 declare variables used here
		String firstName;	// First Name
		String lastName;	// Last Name
		String fullName;	// Full Name
		// TASK #3 declare variables used here
		char firstInitial;	// First Initial
		int stringSize;		// Length of Full Name
		// TASK #4 declare variables used here
		double diameter;	// Diameter
		double radius;		// Radius
		double volume;		// Volume
		
		// Find an arithmetic average.
		average = (((double)SCORE1 + (double)SCORE2) / (double)NUMBER);
		output = SCORE1 + " and " + SCORE2 +
		" have an average of " + average;
		System.out.println(output);
		
		// Convert Fahrenheit temperature to Celsius.
		fToC = ((double)5/9) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " +
		fToC + " in Celsius.";
		System.out.println(output);
		System.out.println(); 			 // To leave a blank line
		
		// ADD LINES FOR TASK #2 HERE
		System.out.print("Please Enter Your First Name: "); //Prompt the user for first name
		firstName = keyboard.nextLine();					//Read the user's first name
		System.out.print("Please Enter Your Last Name: ");	//Prompt the user for last name
		lastName = keyboard.nextLine(); 					//Read the user's last name
		fullName = (firstName + " " + lastName);			//Concatenate the user's first and last names
		System.out.println("Hello " + fullName);			//Print out the user's full name
		
		System.out.println();			 // To leave a blank line
		
		//ADD LINES FOR TASK #3 HERE
		firstInitial = firstName.charAt(0);	// Get the first character from the user's first name
		System.out.println(firstInitial);	// Print out the user's first initial
		fullName = fullName.toUpperCase();	// Convert the user's full name to uppercase
		System.out.println(fullName);		// Print out the user's full name in uppercase
		System.out.println();		// To leave a blank line
		stringSize = fullName.length();		
		System.out.println(fullName + " is " + stringSize + " characters long.");	// Add a line that prints fullName and how many characters in string
		
		System.out.println();			// To leave a blank line
		
		// ADD LINES FOR TASK #4 HERE
		System.out.print("Please Enter Diameter of Sphere: ");		  // Prompt the user for a diameter of a sphere
		diameter = keyboard.nextDouble(); 							  // Read the diameter
		radius = diameter / 2; 										  // Calculate the radius
		volume = ((double)4/3) * (Math.PI * (Math.pow(radius, 3)));   // Calculate the volume
		System.out.println("The Volume of the Sphere is: " + volume); // Print out the volume
 }
}