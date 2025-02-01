/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/
import java.util.Scanner;

public class Parameters
{
  // main method
  public static void main (String [] args)
  {
  new Parameters ();
  }
  // constructor ... method calls / invokes will take place here
  public Parameters ()
  {
  Scanner myObj = new Scanner (System.in);
  
  System.out.println ("What is your name?");
  String user = myObj.nextLine ();
  
  // Invoke / call sayHelloUser Method
  sayHelloUser (user);
  
  System.out.println ("What is the price of you item?");
  double price = myObj.nextDouble ();
  
  applyTax (price);
  
  // Closes the scanner object
  myObj.close ();
  }
  
  // sayHelloUser Method
  // No return type
  // it has a parameter
  public void sayHelloUser (String userName)
  {
  System.out.println ("Hello " + userName + "!");
  }
  
  public void applyTax (double tax)
  {
  System.out.println ("The total including tax will be $" + tax * 1.13);
  }
}