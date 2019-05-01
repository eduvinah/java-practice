package day19_loops;

import java.util.Scanner;

public class Transaction2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
				//you have a balance
				//and assign a value to the balance
				//using scanner
				//what is transaction amount?
				// transaction.
				//we keep doing transaction until 0 balance.
				// "You have insufficient funds, your balance is -10."
				double balance=0;
				double transaction;
				
				while(balance>0) {
					System.out.println("what is transaction amount?");
					balance=scan.nextDouble();
					transaction=scan.nextDouble();
					
					
				}
	}

}
