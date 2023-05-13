package csc123examplereposity;

public class Transaction {
	
	static int counter=1;
	int txnId=0;

	double amount;
	char type;
	int accountnumb;
	public Transaction(double amount, char type/* int accountnumb*/) {
		super();
		this.amount = amount;
		this.type = type;
		this.accountnumb = accountnumb;
		this.txnId=counter++;
	}
	public double getAmount() {
		return amount;
	}
	public char getType() {
		return type;
	}
	public int getaccountnumb()
	{
		return accountnumb;
	}
	public static double toDouble() {
		// TODO Auto-generated method stub
		return 30;
	}
	public int getTxnId() {
		return txnId;
	}

	

}
