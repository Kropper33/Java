import java.util.*;
import java.io.*;   

/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
*/

public class HockeyStats
{
   public static void main(String[] args) throws IOException // Throws Clause
   {
     
      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename; // The user input file name.
      
      // Prompt the user and read in the file name.
      System.out.println("This program calculates " +
      "statistics from a file containing " +
      "data for a hockey player.");
      System.out.print("Please enter the file name: ");
      filename = keyboard.nextLine();


      Scanner inputFile = new Scanner(new File(filename));
      int rowValue = inputFile.nextInt();

      double[][] hockeyData = new double[rowValue][5];

      while (inputFile.hasNextDouble()) 
      {
         for (int row = 0; row < rowValue; row++) 
         {
            for (int column = 0; column < 5; column++) 
            {
               hockeyData[row][column] = inputFile.nextDouble();
            }
         }
      }
      
      // Close input file.
      inputFile.close();
      
      System.out.println("Last 5 Season Stats for LA Kings" 
            + " Goaltender, Jonathan Quick");
      System.out.println();
      // Run method to find Total of all values in array.
      System.out.println("Total Number Games Played: " 
            + getTotal(hockeyData));
      System.out.println();
      
      // Run method to find Average of all values in array.
      System.out.println("Average Number Games Played Per Season: " 
            + getAverage(hockeyData));
      System.out.println();
      
      // Run method to find Total of all values in specified row.
      System.out.println("Total Wins: "
            + getRowTotal(hockeyData, 0));
      System.out.println("Total Losses: "
            + getRowTotal(hockeyData, 1));
      System.out.println();
      
      // Run method to find Total of all values in specified column.      
      System.out.println("Total Games Played (2018-19 Season): "
            + getColumnTotal(hockeyData, 0));
      System.out.println("Total Games Played (2017-18 Season): "
            + getColumnTotal(hockeyData, 1));
      System.out.println("Total Games Played (2016-17 Season): "
            + getColumnTotal(hockeyData, 2));
      System.out.println("Total Games Played (2015-16 Season): "
            + getColumnTotal(hockeyData, 3));
      System.out.println("Total Games Played (2014-15 Season): "
            + getColumnTotal(hockeyData, 4));
      System.out.println();
      
      // Run method to find highest value in specified row.                           
      System.out.println("Most Wins in a Season: "
            + getHighestInRow(hockeyData, 0));
      System.out.println("Most Losses in a Season: "
            + getHighestInRow(hockeyData, 1)); 
      System.out.println();      
      
      // Run method to find lowest value in specified row.                           
      System.out.println("Fewest Wins in a Season: "
            + getLowestInRow(hockeyData, 0));
      System.out.println("Fewest Losses in a Season: "
            + getLowestInRow(hockeyData, 1));                       
   }

   // Method to find Total of all the values in array.
   public static double getTotal(double[][] array) 
   {
      double total = 0;
   
      for (int row = 0; row < array.length; row++) 
      {
         for (int col = 0; col < array[row].length; col++) 
         {
            total += array[row][col];
         }
      }
      return total;
   }
   
   // Method to find Average of all values in array.
   public static double getAverage(double[][] array) 
   {
      double total = 0;

      for (int row = 0; row < array.length; row++) 
      {
         for (int col = 0; col < array[row].length; col++) 
         {
            total += (array[row][col] / 10);
         }
      }
      return total;
   }
   
   // Method to find Total of all values in specified row.
   public static double getRowTotal(double[][] array, int row)
   {
      double total = 0;
      
      for (int col = 0; col < array[row].length; col++) 
      {
         total += (array[row][col]);
      }
      return total;
   }
   
   // Method to find Total of all values in specified column.
   public static double getColumnTotal(double[][] array, int col)
   {
      double total = 0;
      
      for (int row = 0; row < array.length; row++) 
      {
         total += (array[row][col]);
      }
      return total;
   }
   
   // Method to find highest value in specified row.
   public static double getHighestInRow(double[][] array, int row) 
   {
      double high = array[row][0];
      
      for (int col = 1; col < array[row].length; col++) 
      {
         if (array[row][col] > high) 
         {
            high = array[row][col];
         }
      }
      return high;
   }
   
   // Method to find lowest value in specified row.
   public static double getLowestInRow(double[][] array, int row) 
   {
      double low = array[row][0];

      for (int col = 1; col < array[row].length; col++) 
      {
         if (array[row][col] < low) {
            low = array[row][col];
         }
      }
      return low;
   }
}