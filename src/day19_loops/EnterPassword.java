package day19_loops;

import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String password = "abcc123";
		String input;
		do {
			System.out.println("Enter password");
			input = scan.next();
		} while (!input.equals(password));// input is not same as password, keep asking to enter

	}

}
