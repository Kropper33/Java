import java.util.Scanner;

public class Mileage 
{ 
  public static void main(String[] args) 
  { 
	   // Add your declaration and code here.
	  
	  /*
	  Name: Ryan Kropp
	  Date: 2/20/2019
	  Program name: Mileage.java
	  Description: This program calculates gas mileage in miles per gallon.
	  Inputs: NA
	  Output: Print message to standard output.
	  Preconditions: NA
	  Postconditions: NA
	  */
	  
	  Scanner keyboard = new Scanner(System.in);
    
    // Variable Declarations
    double mileage; // Miles driven
    double gas;     // Gallons of gas consumed
    double mpg;     // Gas Mileage in Miles per Gallon
    
    // Program User Input and MPG Calculation
    System.out.println("This program will calculate gas mileage in miles per gallon."); 	//Indicate program function.
    System.out.println("How many miles did you drive?"); 	// Ask user for miles driven.
    mileage = keyboard.nextDouble();  // Read in miles driven.
    System.out.println("How many gallons of gas were consumed?"); 	// Ask user for total gas consumption.
    gas = keyboard.nextDouble(); 	  // Read in gallons used.
    mpg = mileage / gas; 			  // Calculate miles per gallon by dividing miles driven by gallons used.
      
    // Program Calculation Output
    System.out.println("Your gas mileage is " + mpg + " miles per gallon.");
    
    // This calculation is to determine the MPG efficiency of your car.
  } 
}
