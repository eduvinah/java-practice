package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args){
		char letter= 'a';
		while(letter <='z') {
		System.out.print(letter+" ");
		letter++;
		
	}
		System.out.println();
		
		char capitalLetter = 'A';		
		while(capitalLetter <= 'Z') {
			System.out.print(capitalLetter+" ");
			capitalLetter++;			
			
		}
		char reverse = 'z';		 
		while (reverse >= 'a') {
			System.out.println(reverse+" ");
			reverse--;
			
			String letters = "";
			char myletter = 'A';
			while (myletter <= 'Z') {
			letters = letters + myletter;
			System.out.println(letters);
			myletter++;
			
			
		}
			System.out.println("*************");
			String oneletter ="";
			char letter1 ='A';
			while(letter1 <= 'Z') {
				oneletter += oneletter;
				System.out.println(oneletter);
				letter1++;
				
			}
	}
	}
}
