 /*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/

public class ForLoopsPartThree
{
 public static void main (String [] args)
 {
 new ForLoopsPartThree ();
 }
 public ForLoopsPartThree ()
 {
 // Set variables
 int sum = 0;
 int n = 1000;
 
 // Loop body
 for (int i = 1; i <= n; i++)
 {
 // sum until j value is done
 sum += i;
 }
 System.out.println ("sum = " + sum);
 
 
 // Practice 5
 for (int i = 1; i <= 5; i++) // loops the number of rows
 {
  for (int j = 1; j <= i; j++) // loops the number of * per row
  {
  System.out.print ("* "); // prints * with a space to make pattern
  }
  System.out.println (""); // new line
 }
 }
}