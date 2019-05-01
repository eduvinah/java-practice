package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums,7));
		System.out.println(Arrays.binarySearch(nums,55));
		System.out.println(Arrays.binarySearch(nums,2));
		
		int i = Arrays.binarySearch(nums,10);
		System.out.println(i);
		
		int [] nums1 = {55, 4,17, 6,10,10};// binary seacrch does not work  if array is not sorted. it must be sorted already.
		Arrays.parallelSort(nums1);
		System.out.println(Arrays.binarySearch(nums1,17));
	}

}
