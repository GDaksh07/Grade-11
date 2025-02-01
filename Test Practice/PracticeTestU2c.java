/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is to 
*/
public class PracticeTestU2c
{
 public static void main (String [] args)
 {
 new PracticeTestU2c ();
 }
 public PracticeTestU2c ()
 {
 int num = 5;
 int total = 0;
 
 for (int i = 1; i <= num; i++)
 {
 total = (i * i) + total;
 }
 System.out.println ("The total of the sum of all squares from 1 to 5 is " + total);
 }
}