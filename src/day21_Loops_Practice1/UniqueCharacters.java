package day21_Loops_Practice1;

public class UniqueCharacters {

	public static void main(String[] args) {
		             //01234// keep in mind always 
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		System.out.println();
		if(!unique.contains(""+ch)) { // other way (if(unique.indexOf(ch)==-1
			unique+=ch; // unique=unique+ch;
		}
		System.out.println("Unique: "+unique);
	
		//================================================
		
		String word2 = "bananas";
		String unique2 = "";
		
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ch2);
		i =1;
		ch2 = word2.charAt(i);
		System.out.println("ch2: "+ch2);
		
		i++;//2
		ch2 = word2.charAt(i);
		System.out.println("ch2: "+ch2);
		//if(unique2.contains(ch2)) {
	}

}

