/*
Name: Daksh Gulati
Date: 20/09/23
File Name: dakshGulatiPracticeTwo
Purpose: The purpose of this program is to get the user to enter their favourite course name,
         the year they took this course and their final percentage (this can be a decimal)
*/

// import the Scanner class

import java.util.Scanner ;

public class FavCourse
{
 public static void main (String [] args)
 {
 new FavCourse ();
 }
 public FavCourse ()
 {
 Scanner myObj = new Scanner (System.in); // Creates the Scanner Class
 
 // Asks for the users favourite course
 System.out.println ("What is your favourite course?");
 String course = myObj.nextLine ();
 
 // Asks what year the user took their favourite course in
 System.out.println ("What year did you take this in?");
 int year = myObj.nextInt ();
 
 // Asks what final percentage they got in their favourite course
 System.out.println ("What final percentage did you get in this course?");
 double percent = myObj.nextDouble ();
 
 myObj.close (); // Closes the Scanner object
                  // We are done taking input from the scanner
 }
}
// End of Program