package day19_loops;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// you have a balance
		// and assign a value to the balance
		// using scanner
		// what is transaction amount?
		// transaction.
		// we keep doing transaction until 0 balance.
		// "You have insufficient funds, your balance is -10."

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your balance");
		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++;// increase transacton b1.

			System.out.println("what is transaction #" + count + " amount?");
			double transaction = scan.nextDouble();
			// balance=balance-transaction;
			if (transaction > balance) {
				System.out.println("your balance is about to be negative due to this transaction");
			}
			balance -= transaction;
			System.out.println("current balance: "+balance);
		}
		System.out.println("You have insufficient funds, your balance is" + balance);
		System.out.println("transaction total count:" + count);

	}
}
