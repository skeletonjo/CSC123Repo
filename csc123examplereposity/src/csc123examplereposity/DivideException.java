package csc123examplereposity;
import java.util.Scanner;

public class DivideException {
public static float c;
public static float b;
public static int a;
	public static void main(String[] args) {
		try
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter float");
			b = keyboard.nextFloat();
			System.out.println("Enter integer");
			a = keyboard.nextInt();
		}
		catch (Exception d)
		{
			
		}
		try 
		{
			c = a/b;
		}
		catch (Exception e)
		{
			
		}
		finally 
		{
			System.out.println(c);
		}
	}

}
