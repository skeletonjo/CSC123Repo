package csc123examplereposity;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.TreeMap;
import java.util.Scanner;
public class Bank {
	private static ArrayList<Account> accounts = new ArrayList<Account>();
	//private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	private static int accountNumbers =1000;
	private static int input = 0;
	private static int x = 0;
	private static int id = 1;
	private static int transID = 100;
	private static boolean loop = true;
	//private static Map<String, Integer> accounts = new TreeMap<String, Integer>();
	
		
		
	
	public static String openAccount(String firstName, String lastName, String email, String SSN,double odLimit) {
		
		if (odLimit != 0) 
		{
			Person customer = new Person(firstName, lastName, id++, email, SSN);
			Account account = new CheckingAccount(accountNumbers++, customer);
			((CheckingAccount)account).setOdLimit(odLimit);
			accounts.add(account);
			System.out.print("Your accountnumber is: " );
			System.out.println(accountNumbers - 1);
			
		}
		else if (odLimit == 0)
		{
			Person customer = new Person(firstName, lastName, id++, email, SSN);
			Account account = new SavingsAccount(accountNumbers++, customer);
			((SavingsAccount)account).setOdLimit(odLimit);
			accounts.add(account);
			System.out.print("Your accountnumber is: " );
			System.out.println(accountNumbers - 1);
		}
		
			
		return "Thank you, the account number is: " + (accountNumbers-1); 
	}
	
	public int printStatement(int accountNumber) {
		
		for(Account a: accounts)
		{
			if (accounts.equals(accountNumber) == true)
			{
				System.out.println(a.getBalance());
				System.out.println("hi");
				return accountNumber;
			}
		}
		return accountNumber;
		
	}
	
	public String withdraw(int accountNumb, double amount)
	{
		for (Account acc: getAccounts())
		{
			if (acc.getAccountNumber()==accountNumb)
			{
				if (acc.getBalance() - amount >= 0)
				{
					double newamounts = acc.getBalance() - amount;
					//Transaction trans = new Transaction(transID, amount, acc.getBalance(), newamounts);

					//((CheckingAccount)acc).withdraw(amount, accountNumb+69);
					acc.withdraw(newamounts, accountNumb);
					return "Withdraw was successful. Amount is: " + acc.getBalance();
				}
				else if(acc.getBalance() - amount < 0)
				{
					return "You cannot withdraw money";
				}
			}
			
			{
				return "Your withdraw failed.  Your deposit is: " + amount;
			}
		}
		return "Account number could not be found";
	}
	
	public String deposit(int accountNumb, double amount)
	{
		for (Account acc: getAccounts())
		{
			if (acc.getAccountNumber()==accountNumb)
			{
				//if (acc.deposit(amount) == true)
				{
			//	double newamount = acc.getBalance() + amount;
				//((CheckingAccount)acc).deposit(amount);
				acc.deposit(amount);
				//acc.getBalance();
				return "Deposit was successful.  Amount is: " + acc.getBalance();
				}
				/*else if(acc.deposit(amount) == false)
				{
					return "You cannot deposit money";
				}*/
			}
			
			{
				return "Your deposit failed.  Your deposit is: " + amount;
			}
		}
		return "Account number could not be found";
	}
	
	public String closeAccount(int accountNumber)
	{
		for (Account acc: getAccounts())
		{
			if(acc.getAccountNumber() == accountNumber)
			{
				acc.closeAccount();
				if(acc.getAccStatus() == false)
				{
					return "Account " +accountNumber+ " is closed";
				}
			}
		}
		return "Account " + accountNumber+ " could not be found";
	}



	public static void setAccounts(ArrayList<Account> accounts) {
		Bank.accounts = accounts;
	}
	
	public static ArrayList<Account> getAccounts() {
		for(Account acc: accounts)
		{
			System.out.println(acc);
		}
		return accounts;
	}
	public static void printTransaction()
	{
		
		for(Account acc: accounts)
		{
			acc.printTransaction();
		}
	}
	public static void SavingTransFile()
	{
		for(Account acc: accounts)
			{
				acc.SaveTransaction();
			}
	}

	

	/*public static void allaccounts()
	{
		int q = 0;
		for (int w = 1000; w  < accountNumbers; w++) //loop to keep printing
		{
			try
			{
				
				//prints every checking
				
				
				
			}
			catch (Exception f)
			{
				System.out.println("Error");
			}
		}	
	}*/
}

	