package day20_forLoops;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Wooden Spoon";
		//using for loop, print each char one by one
		
		//using for loop, print only vowel.(a,e,io,u)
		 
		for(int i =0; i <word.length(); i++) {
			System.out.println(word.charAt(i));
			
		}
		
		for(int i =0; i <word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
		
		if(letter =='a' || letter == 'e' || letter =='o'|| letter =='i'
				|| letter=='u') {
			System.out.println(letter +", ");
		}
	//using for loop, print only consonants
		if(!(letter =='a' || letter == 'e' || letter =='o'|| letter =='i'
				|| letter=='u')) {
			System.out.println(letter +" ");
	}
}
	}
}