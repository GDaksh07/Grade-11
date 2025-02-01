/*
Name: Daksh Gulati
Date: 21/09/23
File Name: dakshGulatiLab1a
Purpose: The purpose of this program is to calculate perimeter of a rectangle.
         The length and width would be given by the user.
*/

// Import the scanner class
import java.util.Scanner;

public class perimeter
{
 public static void main (String [] args)
 {
 new perimeter ();
 }
 public perimeter ()
 {
 // Create the scanner object
 Scanner myObj = new Scanner (System.in);
 
 // Prompt and get width from the user
 System.out.println ("What is your width");
 double width = myObj.nextDouble ();
   
 System.out.println ("What is you length");
 double length = myObj.nextDouble ();
 
 // Calculate the perimeter
 double perimeter = 2 * (width + length);
 
 // Display the perimeter
 System.out.println ("The perimeter is " + String.format ("%.2f",perimeter) + "cm.");
 
 // Close scanner object
 myObj.close ();
 }
}