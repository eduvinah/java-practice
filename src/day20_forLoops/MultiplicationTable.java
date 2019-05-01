package day20_forLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		//check if it is valid.1-10
		// if it not valid return.
		if(num<1 || num >10) {
		System.out.println("ERROR: Invalid Input");
		//return;// stop execution here.
		System.exit(0); //stop execution
	}
		for (int i =1; i<=10; ++i) {
			int result = num*i;
			System.out.println(num+"x"+i+" = "+result);
			
		}
		
}
	}


