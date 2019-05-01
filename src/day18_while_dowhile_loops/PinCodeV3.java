package day18_while_dowhile_loops;

import java.util.Scanner;

public class PinCodeV3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pin=0;
		int tries=0;
		int secretNumber=2323;
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		while(pin!=secretNumber) {
			System.out.println("enter your pin");
			pin=scan.nextInt();
			tries++;
		
			
			if(tries==3 && pin!=secretNumber) {
				System.out.println("sorry your car is blocked");
				return;
			}
		
			}
			System.out.println("access granted. Select operation");
	}
	}


