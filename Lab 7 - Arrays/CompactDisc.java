import java.io.*;

/**
   Program Name: CompactDisc.java
   Description: This program creates a list of songs for a CD
                by reading from a file
   Inputs: Data from file - Classics.txt
   Outputs: List of songs from file
   Preconditions: NA
   Postconditions: NA
*/

public class CompactDisc
{
	public static void main(String [] args) throws IOException
	{
		FileReader file = new FileReader("Classics.txt");
		BufferedReader input = new BufferedReader(file);
		String title;
		String artist;
		
		// ADD LINES FOR TASK #3 HERE
      // Declare an array of Song objects, called cd,
      // with a size of 6
      Song[] cd = new Song[6];
		
		for (int i = 0; i < cd.length; i++)
		{
			title = input.readLine();
			artist = input.readLine();	
         
         // ADD LINES FOR TASK #3 HERE
         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array
         Song song = new Song(title,artist);
         cd[i] = song;
		}
		
		System.out.println("Contents of Classics:");
		for (int i = 0; i < cd.length; i++)
		{
			// ADD LINES FOR TASK #3 HERE
         // Print the contents of the array to the console
         System.out.print(cd[i]);
		}
	}
}