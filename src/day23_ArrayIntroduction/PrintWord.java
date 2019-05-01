package day23_ArrayIntroduction;

public class PrintWord {

	public static void main(String[] args) {
			String word ="java";
			for(int i = 0; i<=word.length()-1; i++) {
				//condition
				if(word.substring(i,i+1).contentEquals("a")) {
					//if condition is true, go back to 
					//update statement
				continue;
				
			}
			System.out.println(word.substring(i,i+1));
	}


}
}