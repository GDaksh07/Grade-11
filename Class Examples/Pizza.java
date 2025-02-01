/*
Name: Daksh Gulati
Date: 28/09/23
File Name: dakshGulatiPractice4
Purpose: The purpose of this program is to make a decision based on what input the user gives.
         It will tell the user of they can write their G1 (learners) test.
*/

// Import the Scanner class
import java.util.Scanner;

public class Pizza
{
 public static void main (String [] args)
 {
 new Pizza ();
 }
 public Pizza ()
 {
 // Creates Scanner Object
 Scanner myObj = new Scanner (System.in);
 
 // Prompt user if they want to buy pizza
 System.out.println ("Do you want to buy a pizza? Please types yes or no.");
 String userOrder = myObj.nextLine ();
 
 // Decides if user wants to buy a pizza
 if (userOrder.equals ("yes"))
 
   System.out.println ("That will be $5.");
 else
   System.out.println ("Good bye.");
 
 myObj.close ();
 }
}