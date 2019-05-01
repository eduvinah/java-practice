package day23_ArrayIntroduction;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a prime number");
		int num = scan.nextInt();
		
		for (int i=2; i<=num; i++) {
		if(num % i == 0) {
			System.out.println("number is not a prime number");
			break;
		
	
		}else {
		System.out.println(num+" It's a prime number");
	}
		}	
	}
}
