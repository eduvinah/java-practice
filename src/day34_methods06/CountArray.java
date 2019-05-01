package day34_methods06;

import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 5, 7, 2, 3, 5 };

		// 1 way with system.out.....
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 3));

		// 2 way assign return value into variable
		int fives = findOccurences(nums, 5);
		System.out.println(fives);

		if (fives > 0) {
			System.out.println("we have 5s");

		} else {
			System.out.println("no 5s");
		}
		if (findOccurences(nums, 2) > 0) {
			System.out.println("we have 2");
		} else {
			System.out.println("we dont");

		}

		/*
		 * 
		 */

	}

	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for (int num : array) {
			if (num == value) {
				counter++;

			}

		}
		return counter;
	}

	public static int[] getArray() {
		int[] retarray = { 45, 43, 11, 545, 1000 };
		return retarray;
	}
	
	public static int [] getRandomArray(int size) {
		Random rand = new Random(); // create random class object
		int [] nums = new int [size]; // declare array with size number of elems
		for( int i=0; i<size; i++) {// 
			nums [i] = rand.nextInt(101);// get rundom number and assign to array ints
		}
		return nums;
	}
	
}