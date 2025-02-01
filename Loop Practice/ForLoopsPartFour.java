 /*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/

public class ForLoopsPartFour
{
 public static void main (String [] args)
 {
 new ForLoopsPartFour ();
 }
 public ForLoopsPartFour ()
 {
 // Practice 6
 int num = 7;
 System.out.println ("Multiplication Table for " + num + ":");
 
 for
   (int i = 1; i <= 10; i++)
 {
 System.out.println (num + " x " + i + " = " + (num*i));
 }
 
 // Practice 7
 int rows = 5;
 int coloums = 5;
 
 for (int i = 1; i <= rows; i++)
 {
 for (int j = 1; j <= coloums; j++)
 {
 System.out.print (i*j + "\t");
 }
 System.out.println ("");
 }
 }
}