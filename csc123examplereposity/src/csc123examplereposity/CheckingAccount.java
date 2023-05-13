package csc123examplereposity;

public class CheckingAccount extends Account {

	double odLimit;
	public CheckingAccount(int accountNumber, Person accountHolder) {
		super(accountNumber, "Checking", accountHolder);
	}
	public double getOdLimit() {
		return odLimit;
	}
	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	
/*	@Override
	public boolean withdraw(double amount) {
		if(amount<=getBalance()+odLimit)
			return super.withdraw(amount);
		return false;
	}*/
	public boolean deposit(double amount) {
		if(amount<=getBalance()+odLimit)
			return super.deposit(amount);
		return false;
	}

	
	
	
}
