package day23_ArrayIntroduction;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		String ExpectedUserName ="admin";
		String ExpectedPassword = "admi123";
		String username ="";
		String password ="";
		int attempts =5;
		Scanner scan = new Scanner(System.in);
				do {
					while(attempts == 0) {
						System.out.println("You have exceeded number of attempts.");
						System.out.println("This user has ben deactivated for 30 minutes");
						return;

					}
					attempts --;
				System.out.println("Please enter user name");
				username = scan.next();
				if(!username.contentEquals(ExpectedUserName)){
					System.out.println("Wrong user name");
					System.out.println("Attempts left: "+attempts);
					continue;
				}
	
				if(!password.equals(ExpectedPassword)){
					System.out.println("Login successful!");
				}
			}
	}
}
