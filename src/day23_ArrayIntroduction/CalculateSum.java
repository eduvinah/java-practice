package day23_ArrayIntroduction;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		//lets write a program that will calculate the sum of 6 numbers;
		//if numbers is less or equals to 0, ignore this number.
		//wr need to ask to provide a  number
		Scanner scan =  new Scanner(System.in);
		int num=0;
		int sum =0;
		
		for(int i = 0; i<6; i++) {
			System.out.println("enter a number");
			num = scan.nextInt();
			if(num<=0) {
				continue;
			}
			sum+=num;
		}
		System.out.println("Total sum; "+sum);
	}

}
