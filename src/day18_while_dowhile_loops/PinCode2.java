package day18_while_dowhile_loops;

import java.util.Scanner;

public class PinCode2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pincode = 0;
		int attemps = 0;
		int secretPincode = 4325;
		while(pincode != secretPincode) {
			System.out.println("Enter your pincode");
			pincode = scan.nextInt();
			attemps++;
			
			if(attemps==3 && pincode !=secretPincode) {
				System.out.println("card is blocked");
				return;
			}
		}
	}

}
