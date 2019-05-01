package Day36_WrapperClasses;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
	
		// Create an ArrayList
		
		String [] str = new String [5]; // this is basic array
		ArrayList <String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assign values into arraylist;
		names.add("Roman");
		names.add("Maria");
		names.add("Natalia");
		names.add("Irina");
		
		nums.add(12);
		nums.add(34);
		nums.add(99);
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(3));
		
		System.out.println(names.size());
		

	}

}
