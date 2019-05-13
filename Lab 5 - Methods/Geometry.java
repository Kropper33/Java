import java.util.Scanner;

/**
    Program Name: Geometry.java
    Description: This program demonstrates static methods
    Inputs: User inputs alpha numeric responses.
    Outputs: Display calculated values.
    Preconditions: NA
    Postconditions: NA
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;          // The user's choice
      double value = 0;    // The method's return value
      char letter;         // The user's Y or N decision
      double radius;       // The radius of the circle
      double length;       // The length of the rectangle
      double width;        // The width of the rectangle
      double height;       // The height of the triangle
      double base;         // The base of the triangle
      double side1;        // The first side of the triangle
      double side2;        // The second side of the triangle
      double side3;        // The third side of the triangle
      
      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);
      
      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();
         
         choice = keyboard.nextInt();
            switch (choice)
            {
               case 1:
                  System.out.print("Enter the radius of " +
                                    "the circle: ");
                  radius = keyboard.nextDouble();
                  
                  // TASK #3 Call the circleArea method and
                  // store the result in the value variable
                  value = circleArea(radius);
                  
                  System.out.println("The area of the " +
                                       "circle is " + value);
                  break;
				  
               case 2:
                  System.out.print("Enter the length of " +
                                    "the rectangle: ");
                  length = keyboard.nextDouble();
                  System.out.print("Enter the width of " +
                                    "the rectangle: ");
                  width = keyboard.nextDouble();
                  
                  // TASK #3 Call the rectangleArea method and
                  // store the result in the value variable
                  value = rectangleArea(length, width);
                  
                  System.out.println("The area of the " +
                                       "rectangle is " + value);
                  break;
				  
               case 3:
                  System.out.print("Enter the height of " +
                                    "the triangle: ");
                  height = keyboard.nextDouble();
                  System.out.print("Enter the base of " +
                                    "the triangle: ");
                  base = keyboard.nextDouble();
                  
                  // TASK #3 Call the triangleArea method and
                  // store the result in the value variable
                  value = triangleArea(height, base);
                  
                  System.out.println("The area of the " +
                                       "triangle is " + value);
                  break;
				  
               case 4:
                  System.out.print("Enter the radius of " +
                                    "the circle: ");
                  radius = keyboard.nextDouble();
                  
                  // TASK #3 Call the circumference method and
                  // store the result in the value variable
                  value = circumference(radius);
                  
                  System.out.println("The circumference " +
                                       "of the circle is " +
                                       value);
                  break;
				  
               case 5:
                  System.out.print("Enter the length of " +
                                    "the rectangle: ");
                  length = keyboard.nextDouble();
                  System.out.print("Enter the width of " +
                                    "the rectangle: ");
                  width = keyboard.nextDouble();
                  
                  // TASK #3 Call the perimeter method and
                  // store the result in the value variable
                  value = rectanglePerimeter(length, width);
                  
                  System.out.println("The perimeter of " +
                                       "the rectangle is " +
                                       value);
                  break;
				  
               case 6:
                  System.out.print("Enter the length of " +
                                    "side 1 of the " +
                                    "triangle: ");
                  side1 = keyboard.nextDouble();
                  System.out.print("Enter the length of " +
                                    "side 2 of the " +
                                    "triangle: ");
                  side2 = keyboard.nextDouble();
                  System.out.print("Enter the length of " +
                                    "side 3 of the " +
                                    "triangle: ");
                  side3 = keyboard.nextDouble();
                  
                  // TASK #3 Call the perimeter method and
                  // store the result in the value variable
                  value = trianglePerimeter(side1, side2, side3);
                  
                  System.out.println("The perimeter of " +
                                       "the triangle is " +
                                       value);
                  break; 
               default:
               System.out.println("You did not enter " +
                                    "a valid choice.");
            }
                  keyboard.nextLine(); // Consume the new line
                  
                  System.out.println("Do you want to exit " +
                                       "the program (Y/N)?: ");
                  String answer = keyboard.nextLine();
                  letter = answer.charAt(0);
                  
               } while(letter != 'Y' && letter != 'y');
         }
         
   // TASK #1 Create the printMenu method here
   public static void printMenu()
   {
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find area of a Circle");
      System.out.println("2. Find area of a Rectangle");
      System.out.println("3. Find area of a Triangle");
      System.out.println("4. Find circumference of Circle");
      System.out.println("5. Find perimeter of a Rectangle");
      System.out.println("6. Find perimeter of Triangle");
      System.out.println("Enter the number of your choice:");
   }
   // TASK #2 Create the value-returning methods here
   
   /**
   * Calculates the Area of a Circle.<p>
   * Requires parameters for radius of circle.<p>
   * Multiplies pi by the radius squared.
   * @param  radius  The user entered value for radius.
   * @return The value of the calculation for Area.
   */
   public static double circleArea(double radius)
   {
      return Math.PI * Math.pow(radius, 2);
   }
   
   /**
   * Calculates the Area of a rectangle.<p>
   * Requires parameters for length and width.<p>
   * Multiplies the length by the width.
   * @param  length  The user entered value for length.
   * @param  width  The user entered value for width.
   * @return The value of the calculation for Area.
   */
   public static double rectangleArea(double length, double width)
   {
      return length * width; 
   }
   
   /**
   * Calculates the Area of a Triangle.<p>
   * Requires parameters for base and height.<p>
   * Multiplies base by height, then divides by 2.
   * @param  height  The user entered value for height.
   * @param  base  The user entered value for base.
   * @return The value of the calculation for Area.
   */   
   public static double triangleArea(double height, double base)
   {
      return (height * base) / 2;
   }
   
   /**
   * Calculates the Circumference of a circle.<p>
   * Requires parameters for radius of circle.<p>
   * Takes the sum of double the length and width.
   * @param  radius  The user entered value for radius.
   * @return The value of the calculation for Circumference.
   */
   public static double circumference(double radius)
   {
      return 2 * Math.PI * radius;
   }
   
   /**
   * Calculates the Perimeter of a Rectangle.<p>
   * Requires parameters for length and width.<p>
   * Multiplies double the length by double the width.
   * @param  length  The user entered value for length.
   * @param  width  The user entered value for width.
   * @return The value of the calculation for Perimeter.
   */
   public static double rectanglePerimeter(double length, double width)
   {
      return (2 * length) + (2 * width);
   }
   
   /**
   * Calculates the Perimeter of a Triangle.<p>
   * Requires parameters for lengths of 3 sides.<p>
   * Takes the sum of all 3 sides of the Triangle.
   * @param  side1  The user entered value for Side 1.
   * @param  side2  The user entered value for Side 2.
   * @param  side3  The user entered value for Side 3.
   * @return The value of the calculation for Perimeter.
   */   
   public static double trianglePerimeter(double side1, double side2, double side3)
   {
      return side1 + side2 + side3;
   } 
   // TASK #4 Write javadoc comments for each method
}