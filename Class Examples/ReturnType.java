/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/
import java.util.Scanner;

public class ReturnType
{
  // main method
  public static void main (String [] args)
  {
  new ReturnType ();
  }
  // constructor ... method calls / invokes will take place here
  public ReturnType ()
  {
  Scanner myObj = new Scanner (System.in);
  
  // prompt user for the cost of their different meals
  System.out.println ("What is the price of your breakfast?");
  double b = myObj.nextDouble ();
  
  System.out.println ("What is the price of your lunch?");
  double l = myObj.nextDouble ();
  
  System.out.println ("What is the price of your dinner?");
  double d = myObj.nextDouble ();
  
  // Invokes the order method and answer is equal to c
  double c = order (b, l, d);
  
  // Tells the user what the total cost of their food will be after taxes
  System.out.println ("The total cost of all food after taxes is $" + String.format ("%.2f.", total(c))); // invokes total method
  
  // Closes the scanner object
  myObj.close ();
  }
  
  // Applied order method (adds up all values of b, l and d)
  public double order (double breakfast, double lunch, double dinner)
  {
  double order = breakfast + lunch + dinner;
  return order;
  }
  
  // Applies total method (calculates total with tax)
  // calculates tax on order
  // it stores the value of total in cost
  public double total (double cost)
  {
  double total = cost * 1.13;
  return total;
  }
  
  }