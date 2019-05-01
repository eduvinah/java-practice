package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		// ask user "what is the capital of Canada"
		// using a scanner assign the value to capital variable. 
		// Check if the answer is correct. 
		//=> you answer is correct. 
		//false.
		//==> your answer is incorrect value is not capital of Canada.
		String capital;
		Scanner keyboard = new Scanner(System.in);
		/*
		System.out.println("what is the capital of Canada");
		capital = keyboard.nextLine();
		if(capital.equals("Ottawa")) {
		System.out.println("you answer is correct");
		}else {
		System.out.println("your answer is incorrect! " + capital+ " is not capital of Canada" );
		*/
		System.out.println("what is the capital of Canada");
		capital = keyboard.nextLine();
		if(capital.equalsIgnoreCase("Ottawa")) {
		System.out.println("you answer is correct");
		}else {
			System.out.println("your answer is incorrect! " + capital+ " is not capital of Canada" );
		}
		
		}
}

