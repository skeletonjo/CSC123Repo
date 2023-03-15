package csc123examplereposity;

public class Transaction {

	double amount;
	char type;
	public Transaction(double amount, char type) {
		super();
		this.amount = amount;
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public char getType() {
		return type;
	}
	public static double toDouble(double dep, double amountt) {
		double amoun = dep+amountt;
		return amoun;
	}

	

}
