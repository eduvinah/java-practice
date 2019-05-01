package day16_string_manipulation;

public class Concat {

	public static void main(String[] args) {
	String word = "Java";
	System.out.println(word.concat("+selenium"));
	
	word= word.concat(" Automation");
	System.out.println(word);
	 word  = word + true; 
	 System.out.println(word);
	 
	 String word2 = "Hi";
	 word2 = word2.concat("-hey").concat("how are you").concat("-good");
	 System.out.println(word2);
	}

}
