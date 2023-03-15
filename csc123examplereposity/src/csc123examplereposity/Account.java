package csc123examplereposity;

import java.util.ArrayList;
import java.util.Scanner;


public class Account {

	//Fields
		ArrayList<Transaction> trans = new ArrayList<Transaction>();
		private int accountNumber;
		private String type;
		private boolean accountOpen;
		//private double balance;
		private Person accountHolder;
		
		//Constructor
		public Account(int accountNumber, String type, Person accountHolder) {
			this.accountNumber = accountNumber;
			this.type = type;
			this.accountHolder = accountHolder;
			accountOpen=true;
		}
		
		
		public boolean withdraw(double amount) {
			
			if((isOpen()||getBalance()>0)&&amount>0) {
				
				
				trans.add(new Transaction(amount, 'D'));
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean deposit(double amount) {
			if((isOpen()||getBalance()<0)&&amount>0) {
				//this.balance=this.balance+amount;
				trans.add(new Transaction(amount, 'C'));
				return true;
			}
			else {
				return false;
			}
			
		}
		
		public boolean isOpen() {
			return this.accountOpen;
		}
		
		
		public Boolean getAccStatus()
		{
			return accountOpen;
		}
		
		public void closeAccount() {
			this.accountOpen=false;
		}
		
		public double getBalance(double dep, double amount) {
			return Transaction.toDouble(dep, amount);
		}
		
		
		public String toString() {
			return this.accountNumber+":"+type+":"+/*trans.get(accountNumber)+*/":["+this.accountHolder.toString()+"]";
		}


		public int getAccountNumber() {
			return accountNumber;
		}
		/*public int getinputdouble(double inputdouble)
		{
			boolean cinput = true;
			try
			{
			
				while (cinput = true)
				{
					Scanner keyboard = new Scanner(System.in);
					
				}
			}
			catch (Exception e)
			{
				return -5;
			}
			
		}*/

}
