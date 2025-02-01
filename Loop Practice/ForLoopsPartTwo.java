/*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/

public class ForLoopsPartTwo
{
 public static void main (String [] args)
 {
 new ForLoopsPartTwo ();
 }
 public ForLoopsPartTwo ()
 {
 // Loop body
 // Hello World 5 times
 for (int i = 0; i < 5; i++)
 {
 System.out.println ("Hello World");
 }
 
 // Infinite loop
 // Logical error when stuff is left blank
 /*
 for (int i = 1; i >= 1; i++)
 {
 System.out.println ("Infinite Loop " + i);
 }
 */
 
 // Nested Loop
 int weeks = 3;
 int days = 7;
 for (int i = 1; i <= weeks; i++)
 {
 System.out.println ("Week " + i);
 
 for (int j = 1; j <= days; j++)
 {
 System.out.println ("  Day " + j);
 }
 }
 
 }
}