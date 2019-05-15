import javax.swing.*;
import java.util.*;

/**
    Program Name: SlotMachineSim.java
    Description: This program simulates a slot machine and displays results.
    Inputs: Bet Amounts and Play Again Option.
    Outputs: Display final winnings and amount bet.
    Preconditions: All input is alpha-numeric
    Postconditions: NA
*/

public class SlotMachineSim
{
  public static void main (String[] args)
  { 
 //===============================================================
 // Create a Random object to randomize words.
 //================================================================
    Random randomWord = new Random();

 //===================================================================
 // Declare Variables
 //===================================================================
    String userBet;              // Input for bet by user.
    double amountBet;            // Amount Entered by User.
    double userTotal = 0;        // Total Amount User Bet Overall.
    int wordList;                // List for Random Words.
    String word = "";            // Random Word selected.
    String result = "";          // Result to display to user.
    String word1 = "";           // Result Variable to Compare.
    String word2 = "";           // Result Variable to Compare.
    String word3 = "";           // Result Variable to Compare.
    char playAgain = 'Y';        // Runs Slot Machine Again.
    double userWinnings = 0;     // Amount User has Won Overall.
    double gameTotal = 0;        // Number of Games Played by User.
     
 //===================================================================
 // Reset the game to Play Again.
 //===================================================================   
   while(playAgain == 'Y')
   {
      result = "";               //Clears Result to Play Again.
      
 //===================================================================
 // Welcome User and Prompt to Place Bet.
 //===================================================================
      userBet = JOptionPane.showInputDialog("Welcome to the Slot Machine Sim!" + 
                                    "\n\nPlace Your Bet to Begin:");
      amountBet = Double.parseDouble(userBet);
      userTotal = userTotal + amountBet;
      gameTotal = gameTotal + 1;
      
 //===================================================================
 // Perform Randomization.
 //===================================================================
      for(int wordResult = 1; wordResult <= 3; wordResult++)
      {
          wordList = randomWord.nextInt(6);
       
          if (wordList == 0)
          {
            word = "Cherries";
          }
            else if( wordList == 1)
            {
               word = "Oranges";
            }
            else if( wordList == 2)
            {
               word = "Plums";
            }
            else if( wordList == 3)
            {
               word = "Bells";
            }
            else if( wordList == 4)
            {
               word = "Melons";
            }
            else if( wordList == 5)
            {
               word = "Bars";
            }
            
            if(wordResult == 1)
            {
               word1 = word;
            }
               else if (wordResult == 2)
               {
               word2 = word;
               }
               else if (wordResult == 3)
               {
               word3 = word;
               }
      }
      result = result + word1 + "   |   " + word2 + "   |   " + word3;
   
 //===================================================================
 // Perform Check to See if Any Words Match & Display Result
 //===================================================================     
      if((word1 != word2) && (word1 != word3) && (word2 != word3))
      {
         result = result + "\n\nSorry! No Matches." +
                  "\n\nYou win: $0.00";
         userWinnings = userWinnings + 0;
      }     
         else if((word1 == word2) && (word1 != word3) 
                  || (word1 == word3) && (word1 != word2)
                  || (word2 == word3) && (word2 != word1))
         {
            result = result + String.format("\n\nCongratulations!\nYou Matched 2 Words!" +
                     "\n\nYou win: %.2f", (amountBet * 2));
            userWinnings = userWinnings + (amountBet * 2);
         }              
         else
         {
            result = result + String.format("\n\nCongratulations!\nYou Matched All 3 Words!" +
                     "\n\nYou win: %.2f", (amountBet * 3));
            userWinnings = userWinnings + (amountBet * 3);
         }
         result = result + String.format("\n\nTotal Amount won: $%.2f" + 
                           "\nTotal Amount Bet: $%.2f" + 
                           "\nTotal Games Played: %.0f", userWinnings, userTotal, gameTotal);
         
         playAgain = Character.toUpperCase(JOptionPane.showInputDialog(result + 
                           "\n\n\nWould You Like to Play Again?" + 
                           "\nPress Y for Yes or N to Exit.").charAt(0)); 

   }
 //===================================================================
 // Thank User for Playing and Display Final Results
 //=================================================================== 
   JOptionPane.showMessageDialog(null, String.format("Thank You for Playing the Slot Machine Sim!" + 
                  "\n\nTotal Amount Bet: $%.2f" + 
                  "\nTotal Amount Won: $%.2f" + 
                  "\nTotal Games Played: %.0f", userTotal, userWinnings, gameTotal));
   
   System.exit(0);
   
    }
}
