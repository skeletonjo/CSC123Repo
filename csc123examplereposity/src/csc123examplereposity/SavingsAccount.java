package csc123examplereposity;

public class SavingsAccount extends Account{

		double odLimit;
		public SavingsAccount(int accountNumber, Person accountHolder) {
			super(accountNumber, "Savings", accountHolder);
		}
		public double getOdLimit() {
			return odLimit;
		}
		public void setOdLimit(double odLimit) {
			this.odLimit = odLimit;
		}
		
		@Override
		public boolean withdraw(double amount) {
			if(amount<=getBalance()+odLimit)
				return super.withdraw(amount);
			return false;
		}

}
		
		
	
