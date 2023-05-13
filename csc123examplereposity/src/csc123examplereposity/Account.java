package csc123examplereposity;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Account {

	//Fields
		protected ArrayList<Transaction> trans = new ArrayList<Transaction>();
		private int accountNumber;
		private String type;
		private boolean accountOpen;
		private Person accountHolder;

		public Account(int accountNumber, String type, Person accountHolder) {
			this.accountNumber = accountNumber;
			this.type = type;
			this.accountHolder = accountHolder;
			accountOpen=true;
		//	trans  = new ArrayList<Transactions>();
		}
		
		
		public boolean withdraw(double amount, int accountnumb) {
			
			if((isOpen()||getBalance()>0)&&amount>0) {
				
				
				trans.add(new Transaction(amount, 'D'));
				//getBalance();
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean deposit(double amount) {
			if(isOpen()&&amount>0) {
				//this.balance=this.balance+amount;
				trans.add(new Transaction(amount, 'C'));
				//getBalance();
				return true;
			}
			else {
				return false;
			}
			
		}
		public Object printTransaction()
		{
			return trans;
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
		
		public double getBalance() {
			double balance=0;
			
			for(Transaction t: trans) {
				if(t.getType()=='C') {
					balance+=t.getAmount();
				}
				else {
					balance-=t.getAmount();
				}
				
			}
			//System.out.println("Your balance is: " + balance);
			return balance;
		}
		
		
		public String toString() {
			return this.accountNumber+":"+type+":"+/*trans.get(accountNumber)+*/":["+this.accountHolder.toString()+"]";
		}

		public void setAccountNumber()
		{
			
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void SaveTransaction()
		{
			try {
				for (Transaction t:trans)
				{
					String transfilepath = "C:\\Users\\jlewi\\OneDrive\\Desktop\\transactions.txt";
					File Transaction = new File(transfilepath);
					PrintWriter writer = new PrintWriter(transfilepath);
					System.out.println(t);
					writer.println(trans.toString());
					writer.close();
				}
			}
			catch (Exception w)
			{
				System.out.println("Something went wrong with the file");
			}
				
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
