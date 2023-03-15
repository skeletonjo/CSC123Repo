package csc123examplereposity;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//Joseph Lewis jlewis157@toromail.csudh.edu
public class DeAccount {
	public static ArrayList checkingaccounts = new ArrayList();//multiple array list for each part of a account
	public static ArrayList checkingaccmoney = new ArrayList();
	public static ArrayList checkingaccfname = new ArrayList();
	public static ArrayList checkingacclname = new ArrayList();
	public static ArrayList checkingaccssn = new ArrayList();
	public static ArrayList checkingaccoverdraft = new ArrayList();
	public static ArrayList savingaccounts = new ArrayList();
	public static ArrayList savingaccmoney = new ArrayList();
	public static ArrayList savingaccfname = new ArrayList();
	public static ArrayList savingacclname = new ArrayList();
	public static ArrayList savingaccssn = new ArrayList();
	public static ArrayList savingaccoverdraft = new ArrayList();
	public static final int defaults = 0;  //default some values to 0
	public static final int remove = 1000; //used to remove the account number given and get the position in list
	public static int accnumb = 1001; //used to keep track of how many accounts are being checked
	public void checkingcreate()
	{
		String fname, lname, ssn; //var for acc
		String overdraft;
		Scanner key = new Scanner(System.in); //scanner and input
		System.out.println("Enter first name");
		fname = key.nextLine();
		System.out.println("Enter last name");
		lname = key.nextLine();
		System.out.println("Enter social security number");
		ssn = key.nextLine();
		System.out.println("Enter overdraft limit");
		overdraft = key.nextLine();
		for (int z = accnumb-1; z !=accnumb; z++) //loop to make sure account number matches 
		{
			checkingaccounts.add(z); //gives account number to arrow
			System.out.println("Thank you, the account number is: " + z);
		}
		accnumb++; //adds to account number total
		checkingaccmoney.add(defaults); //add values to array list
		checkingaccfname.add(fname);
		checkingacclname.add(lname);
		checkingaccssn.add(ssn);
		checkingaccoverdraft.add(overdraft);
		checkingaccmoney.add(0);
		
	}
	public void savingcreate()  //same thing from checking but with savings
	{
		String fname, lname, ssn; 
		String overdraft;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter first name");
		fname = key.nextLine();
		System.out.println("Enter last name");
		lname = key.nextLine();
		System.out.println("Enter social security number");
		ssn = key.nextLine();
		System.out.println("Enter overdraft limit");
		overdraft = key.nextLine();
		for (int z = accnumb-1; z !=accnumb; z++)
		{
			savingaccounts.add(z);
			System.out.println("Thank you, the account number is: " + z);
		}
		accnumb++;
		savingaccmoney.add(defaults);
		savingaccfname.add(fname);
		savingacclname.add(lname);
		savingaccssn.add(ssn);
		savingaccoverdraft.add(overdraft);
	}
	public void listaccounts()  //list specific account selection 4
	{
		try 
		{
			int in; 
			Scanner lis = new Scanner(System.in); //input for account number
			in = lis.nextInt();
			int s = in - 1000; //turn account number into position in arraylist.  Either checking or savings will print
			System.out.println("Checking account \nYour account number is " + checkingaccounts.get(s));//print arraylist position
			System.out.println("Your first name is " + checkingaccfname.get(s));
			System.out.println("Your last name is " + checkingacclname.get(s));
			System.out.println("Your ssn is " + checkingaccssn.get(s));
			System.out.println("Your overdraft limit is " + checkingaccoverdraft.get(s));
			System.out.println("You have " + checkingaccmoney.get(s) + " money in your account");
			System.out.println("Saving account \nYour account number is " + savingaccounts.get(s));
			System.out.println("Your first name is " + savingaccfname.get(s));
			System.out.println("Your last name is " + savingacclname.get(s));
			System.out.println("Your ssn is " + savingaccssn.get(s));
			System.out.println("Your overdraft limit is " + savingaccoverdraft.get(s));
			System.out.println("You have " + savingaccmoney.get(s) + " money in your account");
		}	
		catch (Exception d) 
		{
			
		}
		
	}
	public void allacc() //print every single account
	{
		int q = 0;
		int r = 0;
		for (int w = 1000; w  < accnumb; w++) //loop to keep printing
		{
			try
			{
				
				//prints every checking
				
				System.out.println("Your checking account number is " + checkingaccounts.get(q));
				System.out.println("Your first name is " + checkingaccfname.get(q));
				System.out.println("Your last name is " + checkingacclname.get(q));
				System.out.println("Your SSN is " + checkingaccssn.get(q));
				System.out.println("Your overdraft limit is " + checkingaccoverdraft.get(q));
				System.out.println("You have " + checkingaccmoney.get(q) + " money in this account");
				q++;
				
			}
			catch (Exception e)
			{
			
			}
		}
		for (int t = 1000; t < accnumb; t++)
		{
			try
			{
				
				//print every saving
				System.out.println("Your savings account number is " + savingaccounts.get(r));
				System.out.println("Your first name is " + savingaccfname.get(r));
				System.out.println("Your last name is " + savingacclname.get(r));
				System.out.println("Your SSN is " + savingaccssn.get(r));
				System.out.println("Your overdraft limit is " + savingaccoverdraft.get(r));
				System.out.println("You have " + savingaccmoney.get(r) + " money in this account");
				r++;
			}
			catch (Exception f)
			{
			
			}
		}
		
	}
	public void deposit() //deposits
	{
		try 
		{
			int inpu, numbe, inmoney, amount, amount2, c, f; 
			String d = ""; //strings
			String e = "";
			Scanner board = new Scanner(System.in); //turning account number into position in arraylist
			inpu = board.nextInt();
			numbe = inpu - 1000;
			d = checkingaccmoney.get(numbe).toString(); //turning arraylist into a string
			e = savingaccmoney.get(numbe).toString();
			c = Integer.parseInt(d); //turning string into an integer
			f = Integer.parseInt(e);
			System.out.println("Enter amount to deposit"); //getting deposit
			inmoney = board.nextInt();
			amount = c + inmoney; //adding to previous ammount
			amount2 = f + inmoney;
			checkingaccmoney.add(numbe, amount); //adding to account
			savingaccmoney.add(inpu, amount2);
			
		}
		catch (Exception n)
		{
			
		}
		
	}
	public void withdrawal()//withdrawal
	{
		try 
		{
			int inpu, numbe, inmoney, amount, amount2, c, f;
			String d = "";
			String e = "";
			Scanner board = new Scanner(System.in);
			inpu = board.nextInt(); //input for account number
			numbe = inpu - 1000; //turning it into position of arraylist
			d = checkingaccmoney.get(numbe).toString(); //turning arraylist to string
			e = savingaccmoney.get(numbe).toString();
			c = Integer.parseInt(d); //turning string to int
			f = Integer.parseInt(e);
			System.out.println("Enter amount to deposit"); //getting deposit
			inmoney = board.nextInt(); 
			amount = c - inmoney;  //subtracting deposit
			amount2 = f - inmoney;
			if (amount < 0)  //if you try to take out too much deposit is 0
			{
				amount = 0;
				System.out.println("Withdrawal failed.  New balance is " + amount);
			}
			if (amount2 < 0)
			{
				amount2 = 0;
				System.out.println("Withdrawal failed.  New balance is " + amount2);
			}
			checkingaccmoney.add(numbe, amount); //changes amount in arraylist
			savingaccmoney.add(inpu, amount2);
		}
		catch (Exception n)
		{
			
		}
	}
	public void closed() //closing account
	{
		try 
		{
			int numbs;
			Scanner keys = new Scanner(System.in); //input for account number
			numbs = keys.nextInt();
			numbs = numbs - 1000; //turns to location in array list
			checkingaccounts.remove(numbs); //remove from all list
			checkingaccfname.remove(numbs);
			checkingacclname.remove(numbs);
			checkingaccssn.remove(numbs);
			checkingaccoverdraft.remove(numbs);
			System.out.println("Your balance was " + checkingaccmoney.get(numbs) + " Deposits are no longer possible" );
			checkingaccmoney.remove(numbs);
			savingaccounts.remove(numbs);
			savingaccfname.remove(numbs);
			savingacclname.remove(numbs);
			savingaccssn.remove(numbs);
			savingaccoverdraft.remove(numbs);
			System.out.println("Your balance was " + savingaccmoney.get(numbs) + " Deposits are no longer possible" );
			savingaccmoney.remove(numbs);
		}
		catch (Exception u)
		{
			
		}
		
	}	
}
