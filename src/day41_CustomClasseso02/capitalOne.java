package day41_CustomClasseso02;

public class capitalOne {

	public static void main(String[] args) {
		 BankAccount  Acc1 = new  BankAccount();
		Acc1.accountHolder = "Bill Gates";
		Acc1.accountNumber = 12345;
		Acc1.deposite(250);
		Acc1.withdraw(100);
		Acc1.showBalance();
		
		Acc1.charge(50, "wooden spoon");	
		Acc1.showBalance();
	}

}
