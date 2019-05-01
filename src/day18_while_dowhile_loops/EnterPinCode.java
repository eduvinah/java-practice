package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPinCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		int PinCode =0;
		
		while (secretPincode != PinCode) {
		secretPincode = scan.nextInt();
		System.out.println("Enter pincode");
		
	}
		System.out.println("Not valid pincode");
	}
}
