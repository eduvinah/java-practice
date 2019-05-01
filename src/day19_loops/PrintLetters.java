package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		String word = "Amazon";
		// 012345
		// print each character one by one in separate lines
		int idx = 0;
		while (idx < word.length()) {
			System.out.println(word.charAt(idx) + " ");
			idx++;
		}
		// print each character in reverse order
		int index = word.length() - 1;

		while (index >= 0) {
			System.out.print(word.charAt(index));
			index--;
		}
		System.out.println();// this prints in a different line
		// in this example, do while loop body code will run
		// once then test the condition. then exit the loop,
		// as condition is false
		int count = 10;
		do {
			System.out.print("Count: " + count);
			count++;

		} while (count <= 5);

	}
}