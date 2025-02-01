/*
Name: Daksh Gulati
Date: 21/09/23
File Name: dakshGulatiLab1a
Purpose: The purpose of this program is to get input from the user
         and tell them if they passed or not
*/
// Import the scanner class
import java.util.Scanner;

public class Marks
{
 public static void main (String [] args)
 {
 new Marks ();
 }
 public Marks ()
 {
 // Creates a Scanner Object
 Scanner myObj = new Scanner (System.in);

 // Prompts user for grades
 System.out.println ("Please enter your marks.");
 int marks = myObj.nextInt ();
 
 if (marks >= 50 && marks <= 100)
   System.out.println ("You passed!");
 
 else if (marks >= 0 && marks < 50)
   System.out.println ("Your failed.");
 
 else
   System.out.println ("Please enter a valid input");
 
 // Closes the Scanner Object
 myObj.close();
 }
}