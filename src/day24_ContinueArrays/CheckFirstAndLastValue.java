package day24_ContinueArrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// write a program that will print true 
		// if first and last number are the same
		// if 1st and last  value of array of ints
		//is same, print true.
		int [] numbers = {12,41,213,21,42,12};
		
		boolean equals = numbers [0]==numbers [numbers.length-1];
		System.out.println(equals);
		
	}
	
	char []newChars = new char [3];
	//System.out.println("value of char : "+newChars[0]);
}
