package day21_Loops_Practice1;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
//		ask user to enter 2 ints:
//		if sum of those ints is not more than 100, then keep asking
//		- once some of those 2 numbers are more than 100 then 
//		Print "Good numbers"
//		program ends. return.

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
		} while (sum <= 100);
		System.out.println("Good numbers");
	}

}
