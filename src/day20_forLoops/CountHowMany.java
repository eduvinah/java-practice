package day20_forLoops;

public class CountHowMany {

	public static void main(String[] args) {
		
		// word
		// char to count the number of occurences
		String word = "computer programming";
		char myChar = 'e';
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == myChar) {
				counter++;
			}
		}
		System.out.println("Count: " + counter);

	}

}
