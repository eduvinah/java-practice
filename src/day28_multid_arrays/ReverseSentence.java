package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		//reverse word
		String sentence = "You are very interesting person";
		//split by space
		String [] sentenceArr = sentence.split(" ");
		System.out.println("Nunber of words: "+ sentenceArr.length);
		System.out.println(Arrays.toString(sentenceArr));
		
		String reverse ="";
		for(int i= sentenceArr.length-1; i>=0; i--) {
			reverse += sentenceArr[i]; 
			//System.out.print(reverse+); // if I print inside the loop it will print every iteration, it has 
			//to be outside the loop so it only prints oncee.
			
		}
		reverse = reverse.trim();
		System.out.print(reverse);
		
		
		}

	}


