/*
Name: Daksh Gulati
Date: 21/09/23
File Name: dakshGulatiLab1a
Purpose: The purpose of this program is to calculate and display
         area (2 d.p.) and circumference (4 d.p.) of a circle.
         The radius will be given by the user.
*/
// Import the scanner class
import java.util.Scanner;

public class circle
{
 public static void main (String [] args)
 {
 new circle ();
 }
 public circle ()
 {
 // Create scanner object
 Scanner myObj = new Scanner (System.in);
 
 // Asks user for radius
 System.out.println ("Please enter your radius.");
 double r = myObj.nextDouble ();
 
 // Calculates area and circumfrence
 double area = Math.PI * Math.pow(r, 2); // Preffered
 double circumference = 2 * Math.PI * r; // Preffered
 
 // Displays the area and circumfrence
 System.out.println ("The area of your circle is " + String.format ("%.2f",area) + "cm squared.");
 System.out.println ("The circumference of your circle is " + String.format ("%.4f",circumference) + "cm.");
 
 // Closes the scanner object
 myObj.close ();
 }
}