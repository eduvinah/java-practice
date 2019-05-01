package day30methods02;

import java.util.Scanner;

public class Introduce {

	public static void main(String[] args) {
	
	
		introduce();
		here();
	}
		
		//method name : introduce
		// params/args: nothing
		// return type: void
		// it will ask for a name and say nice to meet you
		
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you! "+name);
		
	}
	
	public static void here() {
		System.out.println("Where are you from?");
		Scanner scan = new Scanner(System.in);
		String h = scan.next();
		System.out.println("I am from "+h+ "CA");
	}
	}

