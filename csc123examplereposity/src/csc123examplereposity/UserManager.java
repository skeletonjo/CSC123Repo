package csc123examplereposity;
import java.util.Scanner;
import java.util.ArrayList;
public class UserManager {
	private static int selection =1; //variables
	private static String name;
	private static String email;
	private static Boolean mark;
	private static ArrayList array = new ArrayList();  //arraylist 
	public static void main(String[] args) 
	{
		display();//initial display
		scan(); //scanner for choice
		do //loop to keep going until exit
		{
			
			if (selection == 1) //first choice
			{
				first();
			}
			else if (selection == 2) //second choice
			{
				second();
			}
			else //third choice
			{
				third();
			}
			display();// show display again and scanner for input
			scan();
		}while (mark == true);
	}
	public static void display() //list of options
	{
		System.out.println("1 - Register User\n2 - List Users\n3 - Exit");
	}
	public static void scan() //scanner for input
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your choice");
		selection = keyboard.nextInt();
		if (selection == 1 || selection == 2) mark = true; //this is to keep the loop going or to end the loop
	}
	public static void first()
	{
		Scanner keyboards = new Scanner(System.in);// input for name and email
		System.out.print("Enter full name: ");
		name = keyboards.nextLine();
		System.out.println("Enter email address: ");
		email = keyboards.nextLine();
		array.add(name); //adding name and email to array list
		array.add(email);
		
	}
	public static void second()
	{
		System.out.println(array); //display arraylist
	}
	public static void third()
	{
		System.out.println("Goodbye"); //closing program
		System.exit(0);
	}
}
