package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 43, 12, 4, 1, 3, 5 };
		// toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
			// sort method. sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		// ASCII order --> numbers > UPPERCASE > lowercase
		String [] languages = {"Zulu","Spanish","Italian", "Polish","arabic","Uzbek"};
		System.out.println(Arrays.deepToString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		int[] nums2 = { 43, 12, 4, 1, 3, 5 };
		//find lowest and largest values from nums2 array
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		
		int lowest = nums2 [0];
		int largest = nums2 [nums2.length-1];
		System.out.println("Lowest number: "+ lowest);
		System.out.println("Largest number: "+largest);
		
		
		}
		

	}


