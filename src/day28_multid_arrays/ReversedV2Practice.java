package day28_multid_arrays;

import java.util.Arrays;

public class ReversedV2Practice {

	public static void main(String[] args) {
		
		String words = "God is the creator of all creatures";
		String [] word = words.split(" ");
		System.out.println(word.length);
		System.out.println(Arrays.toString(word));
		
		String reversed ="";
		for (int g = word.length-1; g >= 0; g--) {
			reversed += word[g]+" "; 
			
		}
		
		System.out.println(reversed);
	}

}
