/*
Name: Daksh Gulati
Date: 18/09/23
File Name: dakshGulatiPractice2
Purpose: The purpose of this program is to get the users name, age and bank balance
*/

// import the scanner class

import java.util.Scanner;

public class UserInfo
{
  public static void main (String [] args)
  {
  new UserInfo ();
  }
  public UserInfo ()
  {
  Scanner myobj = new Scanner (System.in); // Creates a scanner object
  
  // Get user name
  System.out.println ("What is your name?");
  String name = myobj.nextLine ();
  
  // get user age
  System.out.println ("What is your age");
  int age = myobj.nextInt ();
  
  // get user's bank balance
  System.out.println ("What is your bank balance");
  double amount = myobj.nextDouble ();
  
  // display user input 
  System.out.println ("Your name is " + name + ".");
  System.out.println ("Your age is " + age + ".");
  System.out.println ("Your bank balance is $" + amount + ".");
  }
}