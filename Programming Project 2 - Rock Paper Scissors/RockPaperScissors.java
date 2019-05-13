import javax.swing.*;
import java.util.*;

/**
    Program Name: RockPaperScissors.java
    Description: This program simulates a rock, paper, 
                 scissors game and displays results.
    Inputs: User enter Rock, Paper, or Scissors.
    Outputs: Display Game Results and final winning amount on exit.
    Preconditions: NA
    Postconditions: NA
*/

public class RockPaperScissors
{
	public static void main (String[] args)
	{
		
//===============================================================
// Declare Variables
//===============================================================  
	double userWins = 0;       // Counter for User Wins
	double computerWins = 0;   // Counter for Computer Wins
	double gameTie = 0;        // Counter for Tie Games
	boolean playAgain = true;  // Loops game until user quits.

//===============================================================
// Begin Game Loop
//===============================================================
	while(playAgain)
	{
		int randomNumber = getRandomNumber();
		String computerChoice = computerChoice(randomNumber);
		String userChoice = userChoice();         
		boolean win = isWin(computerChoice, userChoice);
		boolean lose = isLose(computerChoice, userChoice);

//===============================================================
// Display Game Results for Win
//===============================================================
	if (win)
	{
		userWins = userWins + 1;   // Increase User Win Counter
            
		JOptionPane.showMessageDialog(null, String.format("You chose: %s" + 
		"\n\nRock...Paper...Scissors...\n     Shoot!" + 
		"\n\nComputer chooses: %s" +
		"\n\nCongratulations! You win!", userChoice, computerChoice));

		playAgain = playAgain();
	}
         
//===============================================================
// Display Game Results for Loss
//===============================================================          
	else if (lose)
        {
		computerWins = computerWins + 1; // Increase Computer Win Counter
            
		JOptionPane.showMessageDialog(null, String.format("You chose: %s" + 
		"\n\nRock...Paper...Scissors...\n     Shoot!" + 
		"\n\nComputer chooses: %s" + 
		"\n\nSorry, you lost.", userChoice, computerChoice));

		playAgain = playAgain();
         }
         
//===============================================================
// Display Game Results for Tie Game
//===============================================================         
	else
        {
		gameTie = gameTie + 1;        // Increase Tie Game Counter

		JOptionPane.showMessageDialog(null, String.format("You chose: %s" + 
		"\n\nRock...Paper...Scissors...\n     Shoot!" + 
		"\n\nComputer chooses: %s" + 
		"\n\nThats a Tie! Play Again!", userChoice, computerChoice));

		playAgain = true;    // Game automatically begins again
	}					
}
      
//===============================================================
// Display Win, Loss, and Tie Stats upon exit.
//===============================================================      
	JOptionPane.showMessageDialog(null, String.format("Thank You for Playing!" +  
                  "\n\nYou Won %.0f Games!" + 
                  "\nThe Computer Won %.0f Games." + 
                  "\nYou Tied %.0f Games.", userWins, computerWins, gameTie));      
	System.exit(0);
}
   
//===============================================================
// Method for Random object to generate random number.
//===============================================================
	public static int getRandomNumber()
	{		
		Random number = new Random();
		
		return number.nextInt(3) + 1;
	}
   
//===============================================================
// Method to Assign computer's choice from random number.
//===============================================================
	public static String computerChoice(int number)
	{
		if (number == 1)
		{
			return "Rock";
		}
		else if (number == 2)
		{
			return "Paper";
		}
		else
		{
			return "Scissors";
		}
	}
   
//===============================================================
// Method to Welcome User and Prompt to enter selection.
//===============================================================   
	public static String userChoice()
	{
		String userChoice = "";
      
		while (!(userChoice.equalsIgnoreCase("Rock")) && 
		!(userChoice.equalsIgnoreCase("Paper")) && 
		!userChoice.equalsIgnoreCase("Scissors"))
		{
			userChoice = JOptionPane.showInputDialog("Welcome to the Rock, Paper, Scissors Game!\n\n" + 
                                    "Please Type in Your Selection:\n" + 
                                    "Rock, Paper, or Scissors:\n\n");
                                    
			if (!(userChoice.equalsIgnoreCase("Rock")) && 
			!(userChoice.equalsIgnoreCase("Paper")) && 
			!userChoice.equalsIgnoreCase("Scissors"))
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry");
			}                           
		}
		return userChoice;                              
	}
   
//===============================================================
// Method to Perform check to see if user Wins.
//===============================================================  
	public static boolean isWin (String computerInput, String userInput)
	{
		if (userInput.equalsIgnoreCase("Rock"))
		{
			if (computerInput.equalsIgnoreCase("Scissors"))
			{
				return true;
			}
		}
		else if (userInput.equalsIgnoreCase("Paper"))
		{
			if (computerInput.equalsIgnoreCase("Rock"))
			{
				return true;
			}
		}
		else if (userInput.equalsIgnoreCase("Scissors"))
		{
			if (computerInput.equalsIgnoreCase("Paper"))
			{
				return true;
			}
			
		}
		return false;
		
	}

//===============================================================
// Method to Perform check to see if user Loses.
//===============================================================   
	public static boolean isLose (String computerInput, String userInput)
	{
		if (userInput.equalsIgnoreCase("Rock"))
		{
			if (computerInput.equalsIgnoreCase("Paper"))
			{
				return true;
			}
		}
		else if (userInput.equalsIgnoreCase("Paper"))
		{
			if(computerInput.equalsIgnoreCase("Scissors"))
			{
				return true;
			}		
		}
		else if (userInput.equalsIgnoreCase("Scissors"))
		{
			if (computerInput.equalsIgnoreCase("Rock"))
			{
				return true;
			}
			
		}
		return false;		
	}
   
//===============================================================
// Method to Perform check to see if game is a Tie.
//===============================================================   
	public static boolean isTie (String computerInput, String userInput)
	{
		if (userInput.equalsIgnoreCase("") == computerInput.equalsIgnoreCase(""))
		{
			return true;
		}
		else
		{                
			return false;
		}		
	}
   
//===============================================================
// Method to Ask user if they would like to play again.
//===============================================================   
	public static boolean playAgain()
	{		
		int input = Character.toUpperCase(JOptionPane.showInputDialog(
                           "Would You Like to Play Again?" + 
                           "\nPress Y for Yes or N to Exit.").charAt(0));
		if (input == 'Y')
		{
			return true;
		}
		else
		{
			return false;
		}
	}   
}
