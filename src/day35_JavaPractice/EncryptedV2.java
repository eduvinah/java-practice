package day35_JavaPractice;

public class EncryptedV2 {

	public static void main(String[] args) {
		System.out.println(encryptChar ('z'));
		System.out.println(encryptChar('m'));
		String normal ="sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal:  "+ "\n "+ "encrypted: "+ encrypted);
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));
		/*
		 * encrypted char
		 * return type: char 
		 * param: char
		 * takes a char and returns encrypted version 
		 * encryptedChar ('a') ===> 'z'
		 * 
		 * 
		 * encryptwordreturn type: String 
		 * param: String 
		 * take a string and returns encrypted version for the whole word
		 */
	}
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted .charAt(alphabet.indexOf(ch)); // this is the short version
		
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
		
	}
	public static String encryptWord(String word) {
		String cyphered ="";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
			
		}
		return cyphered;
		
	}
	/*
	 * encryptsentence 
	 * return type: string 
	 * param: string sentence 
	 * split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 * 
	 */
	public static String encryptSentence(String sentence) {
		String [] wordsArr = sentence.split(" ");
		String retValue ="";
		for( String word: wordsArr) {
			retValue += encryptWord(word) +" ";
			
		}
		return retValue.trim();
		
	}
}
