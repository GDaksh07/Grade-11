 /*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/
// Imports the scanner class
import java.util.Scanner;

public class WhileLoop2
{
 public static void main (String [] args)
 {
 new WhileLoop2 ();
 }
 public WhileLoop2 ()
 {
 Scanner myObj = new Scanner (System.in); // Creating scanner object
 int secretNumber = 42; // Number to guess
 int guess; // variable where user answer will be stored
 
 System.out.println ("Welcome to the guessing game!");
 
 // Gives instruction to give guess
 System.out.println ("Enter your guess");
 guess = myObj.nextInt ();
 
 // The user keeps on guessing until the guess the number
 while (guess != secretNumber)// While the user is wrong
 {
 System.out.println ("Wrong guess. Try again!");
 System.out.println ("");
 System.out.println ("Enter your guess");
 guess = myObj.nextInt ();
 }
 // User is told they guessed the correct number
 System.out.println ("Congratulations! You guessed the correct number!");
 
 myObj.close ();
 }
}