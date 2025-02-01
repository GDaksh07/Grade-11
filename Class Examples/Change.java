/*
Name: Daksh Gulati
Date: 25/09/23
File Name: dakshGulatiPractice4
Purpose: The purpose is to get the value for change (integer)
         from the user and the program will arrange the amount of 
         change in quarters, dimes, nickles, and pennies
*/

// Import the Scanner Class
import java.util.Scanner;

public class Change
{
 public static void main (String [] args)
 {
 new Change ();
 }
 public Change ()
 {
 // Creates the Scanner Object
 Scanner myObj = new Scanner (System.in);
   
 // Prompt user to give an amount
 System.out.println ("How many cents?");
 int cents = myObj.nextInt ();
 
 // Quarters
 int quarters = cents / 25;
 cents = cents % 25; // Updates cents amount by getting remainder after dividing
   
 // Dimes
 int dimes = cents / 10;
 cents = cents % 10; // Updates cents amount by getting remainder after dividing
 
 // Nickels
 int nickels = cents / 5;
 cents = cents % 5; // Updates cents amount by getting remainder after dividing
 
 // Displays the amount of coins
 System.out.println ("Quarters - " + quarters);
 System.out.println ("Dimes - " + dimes);
 System.out.println ("Nickles - " + nickels);
 System.out.println ("Pennies - " + cents);
 
 // Closes the Scanner Object
 myObj.close ();
 }
}