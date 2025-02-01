/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/
import java.util.Scanner;

public class Calculations
{
  // main method
  public static void main (String [] args)
  {
  new Calculations ();
  }
  // constructor ... method calls / invokes will take place here
  public Calculations ()
  {
  Scanner myObj = new Scanner (System.in);
  
  System.out.println ("What is your height?");
  double heightSet = myObj.nextDouble();
  
  System.out.println ("What is your width?");
  double widthSet = myObj.nextDouble();
  
  // invokes the area method
  double areaTotal = area (heightSet, widthSet);
  
  // invokes the paint method
  double paintTotal = paint (areaTotal);
  
  System.out.println ("The total cost to paint a " + String.format ("%.2f", areaTotal) + " squared units wall will be $" + String.format ("%.2f", paintTotal));
  
  myObj.close ();
  }
  // creates area method
  public double area (double height, double width)
  {
  double areaTotal = height * width;
  return areaTotal;
  }
  
  // creates paint method
  public double paint (double cost)
  {
  double paintTotal = cost * 30;
  return paintTotal;
  }
}