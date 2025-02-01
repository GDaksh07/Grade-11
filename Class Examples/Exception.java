/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/
public class Exception
{
  public static void main (String [] args)
  {
  new Exception ();
  }
  public Exception ()
  {
    
  try
  {
  int result = 6/0; // This line might cause the exception
  System.out.println ("The result of the division is: " + result + ".");
  }
  catch (ArithmeticException AE)
  {
  System.out.println ("Error: Cannot divide by zero. Arithmetic exception");
  }
  
  }
}