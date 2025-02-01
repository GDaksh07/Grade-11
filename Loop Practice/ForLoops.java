/*
Name: Daksh Gulati
Date: 21/11/23
File Name: dakshGulati
Purpose: The purpose of this program is to learn about for loops
*/

public class ForLoops
{
 public static void main (String [] args)
 {
 new ForLoops ();
 }
 public ForLoops ()
 {
   // Loop body
   int i;
   for (i = 0 ; i < 10 ; i++)
   {
    System.out.println ("Welcome to Java!"); 
   }
   System.out.println ("Loop is done\n");
   
   
   // Numbers 0 - 10
   for (i = 0 ; i < 10 ; i++)
   {
    System.out.print (i + " "); 
   }
   // Empty String
   System.out.println (" "); 
   
   
   // Numbers 10 - 1
   for (i = 10 ; i > 0 ; i--)
   {
    System.out.print (i + " "); 
   }
   // Empty space
   System.out.println (" "); 
   
   
    // Numbers 1 - 20 up by 3
   for (i = 1 ; i < 20 ; i+=3)
   {
    System.out.print (i + " "); 
   }
 }
}