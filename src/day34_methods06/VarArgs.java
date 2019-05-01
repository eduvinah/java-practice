package day34_methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		printWords("red", "pink", "yellow", "orange", "green");
		printWords("black");
		printWords();
		
		int a = sum(3,4,6);
		System.out.println(a);
		System.out.println(sum(2,5,77,4));
		
		int budget = 200;
		if(sum (45, 10,50,60) <= budget) {
			System.out.println("Whithin buget");
		}else {
			System.out.println("Broke");
			
		}
		int total = sum (345,34,2,34,56);
		
			System.out.println("total "+total);
			
			System.out.println(nums (23,45,67,3));
			
			cook ("Burrito bolw", "rice", "cheese", "corn", "meat");
			shoppingList (200, "Watch", "clothes","shoes","hat");
			
			String [] myPets = {"cat","horse", "hen"};
			printWords(myPets);
			
			
		}
		
		
	

	public static void printWords(String... words) {
		// handle it like an ARRAY
		for (String w : words) {
			System.out.println(w);
		}

	}

	/*
	 * sum(10,20,30)
	 */
	public static int sum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;

		}
		return sum;
	}
	public static int nums(int...n) {
		int sum =0;
		for(int num: n) {
			sum += num;
		}
		return sum;
	}
	public static void cook(String name, String...ings) {
		System.out.println("Food: "+ name);
		System.out.println(Arrays.toString(ings));

	}
	//public static void shoppingList(int ...prices, String ...strings )// this dont work
	public static void shoppingList(int totalPrice, String...items) {
		System.out.print("total cost:" + totalPrice);
		System.out.println(Arrays.toString(items));
	}
}
