/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/

// Imports the scanner class
import java.util.Scanner;

public class Example
{
  // main method
  public static void main (String [] args)
  {
  new Example ();
  }
  // constructor ... method calls / invokes will take place here
  public Example ()
  {
  Scanner myObj = new Scanner (System.in);
  
  // invoking the circle method
  circle ();
  
  // Gets the value for radius
  System.out.println ("What is the radius?");
  int r = myObj.nextInt ();
  
  // display the area + invoke the area method
  // Area (r): invokes the method 'area' and pass it the value for r
  System.out.println ("The area is " + area (r));
  
  // invoking the circle method
  circle ();
  
  myObj.close ();
  }
  
  // Circle method
  public void circle ()
  {
  System.out.println ("    **");
  System.out.println ("   *  *");
  System.out.println ("    **");
  }
  
  // Area method
  public double area (int radius)
  {
  double area = Math.PI * radius * radius; // calculate area
  return area;
  }
}