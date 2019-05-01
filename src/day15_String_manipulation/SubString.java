package day15_String_manipulation;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java String manipulation is fun!";
		System.out.println(sentence.substring(0, 4));// java
		System.out.println(sentence.substring(5, 11));// string
		System.out.println(sentence.substring(7, 11));// ring
		System.out.println(sentence.substring(10, 5));// does not do reverse.
	}

}
