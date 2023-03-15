package csc123examplereposity;

public class SavingAccount {

	public SavingAccount(int accountNumber,  Person accountHolder) {
		super(accountNumber, "Saving", accountHolder);
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount<=getBalance())
			return super.withdraw(amount);
		return false;
	}

	

}
