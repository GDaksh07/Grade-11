/*
Name: Daksh Gulati
Date: 21/09/23
File Name: dakshGulatiPractice6
Purpose: The purpose of this program is to tell the user to give their age and the program
         will tell them which category they belong to based on their age.
*/
// Import the scanner class
import java.util.Scanner;

public class Citizen
{
 public static void main (String [] args)
 {
 new Citizen ();
 }
 public Citizen ()
 {
 // Creates a Scanner Object
 Scanner myObj = new Scanner (System.in);

 // Prompts user for grades
 System.out.println ("Please enter your marks.");
 int age = myObj.nextInt ();
 
 if (age >= 65)
   System.out.println ("You are a senior citizen.");
 
 else if (age >= 21 && age < 65)
   System.out.println ("Your are a adult.");
 
  else if (age >= 18 && age < 21)
   System.out.println ("Your are a teen.");
  
   else if (age >= 0 && age < 18)
   System.out.println ("Your are a child.");
 
 else
   System.out.println ("Please enter a valid input");
 
 // Closes the Scanner Object
 myObj.close();
 }
}