package day21_Loops_Practice1;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();// javva
		String unique = "";

		for (int i = 0; i < word.length(); i++) {
			// read the letter and assign

			char letter = word.charAt(i);
			// System.out.println(letter);
			if (!unique.contains("" + letter)) {
				unique += letter; // add to unique
				/// IN THIS PROBLEM THE RESULT WONT HAVE REPEATED LETTER.

			}

		}
		System.out.println(unique);

//		for(int i = 0; i<word.length(); i++) {
//			System.out.print(i); //print i. it increases every loop. and print the number of the word.
//			System.out.println(word.charAt(i));
	}
}
