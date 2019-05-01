package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {
        //	passing Percentage = 65	;
		//yourScorePercentage = take from scanner
		// check if you passed or failed
		int Percentage = 65;
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your score");
		score = scan.nextInt();
		if (score >= Percentage) {
			System.out.println("You passed! congratulations");
		}else {
			System.out.println("you failed! study more! dont be sad!");
			System.out.println("java is fun!");
		
		}
		
		

	}

}
