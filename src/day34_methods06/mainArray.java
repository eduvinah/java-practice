package day34_methods06;

import java.util.Arrays;

public class mainArray {

	public static void main(String[] args) {
		// this way is possible 
		System.out.println((Arrays.toString(CountArray.getArray())));
		
		//or this one is shorter.
		int []nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
		
		System.out.println((Arrays.toString(CountArray.getRandomArray(10))));
		
		int [] arr = CountArray.getRandomArray(50);
		System.out.println(Arrays.toString(arr));
		
	}

}
