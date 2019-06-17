package day43_encapsulation_constructor;

public class CheckingAccount extends BankAccount {
	private boolean overdraft;

	public CheckingAccount(String name, boolean overdraft) {
		super(name);
		this.overdraft = overdraft;
	}
	public boolean  hasOverdraft() {
		return overdraft;
	}
	public boolean clearCheck(double amount) {
		if(amount < getBalance() || overdraft) {
		return true;
	}
		System.out.println("not enough money");
	return false;
}
}
