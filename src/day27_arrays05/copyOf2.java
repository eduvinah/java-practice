package day27_arrays05;
import java.util.*;
public class copyOf2 {

	public static void main(String[] args) {
		// copy of values from array and also add 2 more elements
		int [] nums1 = {34,56,23,55};
		int [] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		int [] nums3 = Arrays.copyOf(nums1, nums1.length+3);
		
		System.out.println("nums3"+ Arrays.copyOfRange(nums1,1,4));
		
		System.out.println(Arrays.toString(nums2));
		
		int [] brandNew = {34,23,54,23};
		System.out.println("Length before: "+brandNew.length);
		brandNew = Arrays.copyOf(brandNew,  brandNew.length +5);
		
		System.out.println("Length after: "+brandNew.length);
	}

}
