package csc123examplereposity;
import java.util.Scanner;

public class BankProcess {
public static int accountnumb = 1000;
public static boolean loop = true;
	public static void main(String[] args)
	{
		do {
		 	display();
		 	Scanner keyboard = new Scanner(System.in);
		 	Bank DaBank = new Bank();
		 	int y = 0;	
			try { //Scanner for choice
				
				y = keyboard.nextInt();
				keyboard.nextLine();
				}
			catch (Exception i) //invalid input
			{
				System.out.println("There is something wrong with your input.  Please try again.");
			}
			if (y > 9 || y < 1)
			{
				System.out.println("Please enter a number from 1 to 8");
			}
			switch (y) {
			case 1: //each case is each option
				System.out.println("Opening a checking account");
				System.out.println("Enter first name");
				String fnaame = keyboard.nextLine();
				System.out.println("Enter last name");
				String lastnaame= keyboard.nextLine();
				System.out.println("Enter email address");
				String emailadd = keyboard.nextLine();
				System.out.println("Enter social security number");
				String social = keyboard.nextLine();
				try {
				System.out.println("Enter overdraft limit");
				double overdraf = keyboard.nextDouble();
				if (overdraf >0)
				{
					DaBank.openAccount(fnaame, lastnaame, emailadd, social, overdraf);
				}
				else if (overdraf == 0)
				{
					System.out.println("If overdraft is going to be 0, try opening a savings account instead");
				}
				else if (overdraf < 0)
				{
					System.out.println("Overdraft cannot be negative.  Try again");
				}
			} catch (Exception w)
				{
					System.out.println("Overdraft can only be a number.  Try again");
				}
				
				break;
			case 2:  
				System.out.println("Opening a savings account");
				System.out.println("Enter first name");
				String fnaam = keyboard.nextLine();
				System.out.println("Enter last name");
				String lastnaam = keyboard.nextLine();
				System.out.println("Enter email address");
				String emailad = keyboard.nextLine();
				System.out.println("Enter social security number");
				String socia = keyboard.nextLine();
				double nodraft = 0;
				DaBank.openAccount(fnaam, lastnaam, emailad, socia, nodraft);
				
				break;
			case 3:
				System.out.println("Listing all accounts");
				DaBank.getAccounts();
				break;
			case 4:
				System.out.println("Enter account number");
				int accoun = keyboard.nextInt();
				DaBank.printStatement(accoun);
				System.out.println(DaBank.printStatement(accoun));
				break;
			case 5:
				System.out.println("Enter account number");
				int accou = keyboard.nextInt();
				System.out.println("How much do you want to deposit");
				double dep = keyboard.nextDouble();
				System.out.println(DaBank.deposit(accou, dep));
				break;
			case 6:
				System.out.println("Enter account number");
				int accountn = keyboard.nextInt();
				System.out.println("How much do you want to withdraw");
				double withdra = keyboard.nextDouble();
				System.out.println(DaBank.withdraw(accountn, withdra));
				break;
			case 7:
				System.out.println("Enter account number");
				int acco = keyboard.nextInt();
				DaBank.closeAccount(acco);
				break;
			case 8:
				DaBank.SavingTransFile();
				break;
			case 9:
				System.exit(0);
				break;
			}
		}while (loop = true);
		
			/*if (y ==1){
			
				System.out.println("Opening a checking account");
				System.out.println("Enter first name");
				String fnaame = keyboard.nextLine();
				System.out.println("Enter last name");
				String lastnaame= keyboard.nextLine();
				System.out.println("Enter email address");
				emailadd = keyboard.nextLine();
				String emailAddress=email;
				System.out.println("Enter social security number");
				SSN = key.nextLine();
				Bank.openCheckingAccount("hi", "how", "are", "you", );
				accountnumb++;
				
			}
			else if (y ==2)
			{
				System.out.println("Opening a savings account");
				openCheckingAccount("hi", "how", "are", "you", );
				
			}
			else if (y == 3)
			{
				System.out.println("Listing all accounts");
				System.out.println(getAccounts());
			}
			else if (y==4)
			{
				System.out.println("Enter account number");
			}
				
			else if (y==5)
			{
				System.out.println("Enter account number");
				//acc.deposit();
			}
			else if (y==6)
			{
				System.out.println("Enter account number");
				
			}
			else if (y==7)
			{
				System.out.println("Enter account number");
			}
			else if (y==8)
			{
				System.out.println("Exiting");
				System.exit(0);
			}
			else
			{
				System.out.println("There is something wrong with your input. Try again");
			}*/
		
	
}		
	
	public static void display()
	{
		System.out.println("1   Open a Checking account\r\n" + 
				"2   Open Saving Account\r\n" + 
				"3   List Accounts\r\n" + 
				"4   Account Statement\r\n" + 
				"5   Deposit funds\r\n" + 
				"6   Withdraw funds\r\n" + 
				"7   Close an account\r\n" + 
				"8   Save Transactions\r\n"+ 
				"9   Exit\r\n\n" +
				"Please enter your choice: ");
				
	}

}
