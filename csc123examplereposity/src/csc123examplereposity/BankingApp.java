package csc123examplereposity;
import java.util.Scanner;

//This is the main class
//Joseph Lewis jlewis157@toromail.csudh.edu

public class BankingApp {
	private static int x = 0; //used for loop of application
	public static DeAccount acc = new DeAccount(); //second class
	public static void main(String[] args) {
		input(); //contains everything involving input basically everything
	}
	public static void display()  //menu
	{
		System.out.println( "1 – Open a Checking account\r\n" + 
							"2 – Open Saving Account\r\n" + 
							"3 – List Accounts\r\n" + 
							"4 – Account Statement\r\n" + 
							"5 – Deposit funds\r\n" + 
							"6 – Withdraw funds\r\n" + 
							"7 – Close an account\r\n" + 
							"8 – Exit \n \nPlease enter your choices");
	}
	public static void input()
	{
		//do while loop so does once but will keep going unless 8 is hit
		//basically infinite loop until 8
			do {
				display(); //menu
				try { //Scanner for choice
					Scanner keyboard = new Scanner(System.in);
					x = keyboard.nextInt();
					}
				catch (Exception i) //invalid input
				{
					System.out.println("There is something wrong with your input.  Please try again.");
				}
				finally { //if input is fine then one of the following will happen depending on menu option
					switch (x) {
					case 1: //each case is each option
						System.out.println("Opening a checking account");
						acc.checkingcreate();
						break;
					case 2:  
						System.out.println("Opening a savings account");
						acc.savingcreate();
						break;
					case 3:
						System.out.println("Listing all accounts");
						acc.allacc();
						break;
					case 4:
						System.out.println("Enter account number");
						acc.listaccounts();
						break;
					case 5:
						System.out.println("Enter account number");
						acc.deposit();
						break;
					case 6:
						System.out.println("Enter account number");
						acc.withdrawal();
						break;
					case 7:
						System.out.println("Enter account number");
						acc.closed();
						break;
					case 8:
						System.exit(0);
						break;
					}
			}
	} while (x >= 1 && x <= 8);
	}
}
