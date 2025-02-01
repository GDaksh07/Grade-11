/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is to 
*/

import java.util.Scanner;
import java.util.Random;

public class PracticeTestU2d
{
 public static void main (String [] args)
 {
 new PracticeTestU2d ();
 }
 public PracticeTestU2d ()
 {
   
 Scanner myObj = new Scanner (System.in);
 
 Random randomNumber = new Random ();
 int secretNumber = randomNumber.nextInt(100)+1;
 
 int guess;
   
 System.out.println ("Guess the number between 1 and 100!");
 
 do
 {
 System.out.println ("What is your guess?");
 guess = myObj.nextInt();
 
 if (guess < secretNumber)
   System.out.println ("Too low! Try again.\n");
 else if (guess > secretNumber)
   System.out.println ("Too high! Try again.\n");
 else
   System.out.println ("Congratulations! You got the correct number.");
 }
 while (guess != secretNumber);
 System.out.println ("Exiting the program.");
 
 myObj.close ();
 }
}