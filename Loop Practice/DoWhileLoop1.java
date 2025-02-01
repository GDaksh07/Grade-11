/*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/
import java.util.Scanner;
public class DoWhileLoop1
{
 public static void main (String [] args)
 {
 new DoWhileLoop1 ();
 }
 public DoWhileLoop1 ()
 {
 Scanner myObj = new Scanner (System.in); // Creating scanner object
 // Practice 1
 int i = 1;
 do
 {
 System.out.print (i + " ");
 i++;
 }
 while (i <= 5);
 
 System.out.println (" ");
 // Practice 2
 int j = 2;
 do
 {
 System.out.print (j + " ");
 j+=2;
 }
 while (j <= 10);
 
 System.out.println (" ");
 // Practice 3
 int choice;
 do
 {
 System.out.println ("1. Print Hello");
 System.out.println ("2. Print World");
 System.out.println ("3. Exit");
 
 System.out.println ("Enter your choice:");
 choice = myObj.nextInt ();
 System.out.println ("");
 
 if (choice == 1)
   System.out.println ("Hello");
 else if (choice == 2)
   System.out.println ("World");
 else if (choice == 3)
   System.out.println ("Exiting the program");
 else
   System.out.println ("Please enter a valid answer.");
 }
 while (choice != 3);
 
 myObj.close();
 }
}