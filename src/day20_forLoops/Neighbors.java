package day20_forLoops;

import java.util.Scanner;

public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter word");
		String word = scan.next();
		//aabcdd if character and next one are same print
		//Beeep -a
		//Beep -d
		
		for(int i =0; i<word.length()-1; i++) {
			if (word.charAt(i)==word.charAt(i+1)) {
				System.out.println("Beep - "+word.charAt(i));
			}
	}

}
}