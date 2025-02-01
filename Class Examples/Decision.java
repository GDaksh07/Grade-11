/*
Name: Daksh Gulati
Date: 28/09/23
File Name: dakshGulatiPractice3
Purpose: The purpose of this program is to make a decision based on what input the user gives.
         It will tell the user of they can write their G1 (learners) test.
*/

// Import the Scanner class
import java.util.Scanner;

public class Decision
{
 public static void main (String [] args)
 {
 new Decision();
 }
 public Decision()
 {
 // Creates Scanner Object
 Scanner myObj = new Scanner (System.in);
 
 // Prompt user to get their age
 System.out.println ("What is your age?");
 int userAge = myObj.nextInt ();
   
 // Decides if the user is able to wire the G1 test
 if (userAge >= 16)
 System.out.println ("You are able to write the G1 test.");
 
 else
 System.out.println ("You cannot take the G1 test.");
 
 // Closes the Scanner Object
 myObj.close ();
 }
}