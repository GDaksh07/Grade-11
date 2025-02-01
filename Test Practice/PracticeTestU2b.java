/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is to 
*/
public class PracticeTestU2b
{
 public static void main (String [] args)
 {
 new PracticeTestU2b ();
 }
 public PracticeTestU2b ()
 {

 int num = 10;
 int total = 1;
   
 for (int i = 2; i <= num; i+=2)
 {
 total = i * total;
 }
 System.out.println ("The product of all even number up to 10 is " + total);
 
 }
}