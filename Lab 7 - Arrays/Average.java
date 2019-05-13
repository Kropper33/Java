import java.util.*;

/**
   Program Name: Average.java
   Description: This class will allow a user to enter 5 scores 
   into an array. It will then rearrange the data in
   descending order and calculate the mean for the data set.
   Inputs: Numeric test scores
   Outputs: Data sorted in descending order and average of scores.
   Preconditions: NA
   Postconditions: NA
*/

public class Average
{
   Scanner keyboard = new Scanner(System.in);
   
   // Declare Arrays
   int[] data = new int[5];
   double mean;
        
   // Create Average Constructor
   public Average()
   {
      for (int index = 0; index < data.length; index++)
      {
          System.out.print("Enter score for Test " + (index + 1) + ": ");
          data[index] = keyboard.nextInt();
      }
   }
   
   // Create method to calculate the Mean   
   public void calculateMean()
   {
      double total = 0;
    	for (int index = 0; index < data.length; index++)
    	{
    		total += data[index];
    	}
    	mean = (total / data.length);
   }
   
   // Create String to return data
   public String toString()
   {
      String output;
      output = "Entered Scores (Descending Order):\n";
      
      for(int index = 0; index < data.length; index++)
      {
         output = output + data[index] + "\n";
      }
      output = output + "\nYour average is: " + mean;
      return output;
   }
   
   
   // Create Method to sort data in descending order
   public void selectionSort()
   {
		int startScan,index,minIndex,minValue;
      
		for (startScan = 0; startScan < (data.length - 1); startScan++)
		{
         minIndex = startScan;
         minValue = data[startScan];
         for (index = startScan + 1; index < data.length; index++)
         {
         	if (data[index] < minValue)
         	{
         		minValue = data[index];
         		minIndex = index;
         	}
         }
         data[minIndex] = data[startScan];
         data[startScan] = minValue;
      }
   }   
}


