/*
Name: Daksh Gulati
Date: 21/09/23
File Name: dakshGulatiPractice3
Purpose: 
*/

// Import scanner class
import java.util.Scanner ;

public class SunnyDay
{
 public static void main (String [] args)
 {
 new SunnyDay ();
 } 
 public SunnyDay ()
 {
 Scanner myObj = new Scanner (System.in); // Creates a scanner object
 
 // Display's the message
 // Beautiful day
 System.out.println ("It is a beautiful day outside!");

 System.out.println ("Do you agree with what is said?");
 // char agree = myObj.nextChar ();
 
 // Promt user and get their fav. season
 System.out.println ("What is your favourite season");
 String season = myObj.nextLine ();

  // Promt user and get how many students are in their class
 System.out.println ("How many students are in your class");
 int students = myObj.nextInt ();
 
 
  // Promt user and get how many L of water should one drink in a day
 System.out.println ("How many L of water should one drink in a day");
 double water = myObj.nextDouble ();
 
 // Display info back to user
 System.out.println (season + " that is also my fav. season.");
 System.out.println ("I also have " + students + " students in my class.");
 System.out.println ("I agree, the number of L of water drank should be " + water);
 
 // Promt user for length and width
 System.out.println ("Please enter the length of your rectangle.");
 double recLength = myObj.nextDouble ();
 System.out.println ("Please enter the width of your rectangle.");
 double recWidth = myObj.nextDouble ();
 
 // Calculat area
 double area = (recLength * recWidth);
 
 // Display the area
 System.out.println ("The area of your rectangle is " + area + "cm squared.");
 
 // Closes the scanner object
 myObj.close ();
 }
}