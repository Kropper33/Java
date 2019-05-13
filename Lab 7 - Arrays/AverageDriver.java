/**
 This program creates a list of test scores
 in descending order, and calculates Average
*/

public class AverageDriver {

   public static void main(String [] args)
   {
      Average avg = new Average();
    	avg.calculateMean();
    	avg.selectionSort();
    	System.out.print(avg.toString());
   }
}