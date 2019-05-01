package day23_ArrayIntroduction;

public class PrintLetters {

	public static void main(String[] args) {
		// outer loop will repeat printing of letter as many times as u want
		//in this case we are gonna print 3 times.
		// so we are repeating inner loop 3 times.
		for (int i = 0; i < 3; i++) {
			// write a for loop, that will print letter from a to z
			for (char letter = 'z'; letter >= 'a'; letter--) {
				System.out.print(letter+ " ");
			}
			System.out.println();
			System.out.println("***************************************************");
		}
		System.out.println();
		System.out.println(":):) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) ");
		for (int i = 0; i < 4; i++) {
			// write a for loop, that will print letter from a to z
			for (char letter = 'a'; letter <='z'; letter++) {
				System.out.print(letter+ " ");
			}
			System.out.println();
			System.out.println("***************************************************");
	}
}
}