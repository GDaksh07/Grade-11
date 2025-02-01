/*
Name: Daksh Gulati
Date: 10/10/23
File Name: dakshGulatiPractice7
Purpose: The purpose of this program is to 
*/
// Import the random class
import java.util.Random;

public class RandomInt
{
 public static void main (String [] args)
 {
 new RandomInt ();
 }
 public RandomInt ()
 {
 // Creates Random Object
 Random myObj = new Random ();
 
 // Generate random integer between 0 and 9
 int randomNumber = myObj.nextInt (10);
 
 // Generates a random double value between 0.0 and 1.0
 double randomDouble = myObj.nextDouble ();
 
 // Prints the random number
 System.out.println ("The random number is " + randomNumber + ".");
 System.out.println ("The random number is " + randomDouble + ".");
 }
}