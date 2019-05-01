package day24_ContinueArrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// lets create an array of integers with length 3
		int [] numbers = new int[3];
		//1st value in array
		numbers [0] =25;
		//2nd value in array
		numbers [1] =10;
		//3rd value in array
		numbers [2] =20;
		// this is a hash code when the print numbers is run., not correct;
		//**System.out.println(numbers);
		//toString() from arrays class can help as to print an arrays as string
		System.out.println(Arrays.toString(numbers));
		int sum =0;
		//please use for loop in order to loop through the arry 
		//and calculate sum of all elements.
		// numbers.length --> returns number of element in the array
		for(int i =0; i<numbers.length; i++) {// no parenthesis after length because length in this case is to calculate the sum
			sum+=numbers[i];
	}
		System.out.println("Sum: "+sum);
		//find largest value in the array
		int max= Integer.MIN_VALUE;
		for(int i =0; i <numbers.length; i++) {
			if(numbers[i]> max) {
				max = numbers[i];
				
			}
		}
		System.out.println("Max value: "+ max);
		// find value in the array
		int min= Integer.MAX_VALUE;
		for (int i =0; i<numbers.length; i++){
			if(numbers [i]<min) {
				min = numbers[i];
				
			}
		}
		System.out.println("min value: "+ min);
	}
}
