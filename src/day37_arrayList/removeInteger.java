package day37_arrayList;
import java.util.*;
public class removeInteger {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList <>();
		
		nums.add(4);
		nums.add(6);
		nums.add(5);
		nums.add(4);
		nums.add(2);
		nums.add(6);
		nums.add(3);
		nums.add(7);
		
		System.out.println(nums.remove(5));
		
		Integer n1 = new Integer(5); // this way is posible to remove a number or like below
		nums.remove(new Integer(4));
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);

	}

}
