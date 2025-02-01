/*
Name: Daksh Gulati
Date: 29/11/23
File Name: dakshGulatiLab3a
Purpose: The purpose of this program is
*/
public class Exception2
{
  public static void main (String [] args)
  {
  new Exception2 ();
  }
  public Exception2 ()
  {
  try
  {
  String [] pets = {"cat", "dog", "monkey"};
  System.out.println ("Pet picked is " + pets[3]);
  }
  catch (ArrayIndexOutOfBoundsException AE)
  {
  System.out.println ("Error. Pick a number between 0 and 2. Array index out of bounds exception");
  }
  }
}