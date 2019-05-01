package day35_JavaPractice;

public class EncryptionFun {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "easter";
		
//		"e"-->"v";
//		"a"--> "z";
//		"s"--> "h";
//		"t"---> "g";
//		"e"---> "v";
//		"r"---> "i";
		
		
		
		// get a char from word 
		// find indexOf the char in alphabet 
		// read the char from encrypted at he index
		// add to some string 
		
		char first = word.charAt(0);// e
		int position = alphabet.indexOf(first);
		System.out.println(position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " ----> "+ enChar);
		
		String encryptedWord = "";
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet '
			
			int index = alphabet.indexOf(ch);
			System.out.println(encrypted.charAt(index));
		   encryptedWord+=encrypted.charAt(index);
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		}
	
		
	}


