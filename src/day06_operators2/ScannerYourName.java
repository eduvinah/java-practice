package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("hi, what is your name?");
		String name = scan.next();//accept String input 
		System.out.println("nice to meet you, " +name);

	}

}
