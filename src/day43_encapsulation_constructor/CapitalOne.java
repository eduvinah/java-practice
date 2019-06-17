package day43_encapsulation_constructor;

public class CapitalOne {

	public static void main(String[] args) {
		 CheckingAccount account1 = new  CheckingAccount("James Bond", false);
		 System.out.println(account1);
		 account1.deposit(100000);
		 account1.clearCheck(500);
		 System.out.println(account1.getBalance());
	}

}
