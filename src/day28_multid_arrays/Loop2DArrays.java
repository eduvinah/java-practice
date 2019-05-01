package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {

		String[][] pizzas = { { "pineaple", "pepperoni" }, // 0
				{ "anchovies", "mushroom", "olives" }, // 1
				{ "4 cheese" }, // 2
				{ "chicken", "tomatoes", "jalapenos", "onions" }, // 3
				{ "green peppers", "zuccini", "spinach", "shrimp" } };// 4

		// System.out.println(Arrays.toString(pizzas[0]));

		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println("########FOR LOOP#######");

		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
			
		}
		for(String  topping : pizzas[3]) {// will show the toppings on pizza #3, chicken
			// tomatoes, jalapenos, onions.
			System.out.println(topping);
		}
		
		int [][] students = {
				{4,5,6},
				{12,5,7},
				{23,55,12,55,3}
				};
		// 2 parts: outer loop , inner loop
		//outer loop will take each group 
		// inner loo will take each value/student id
		
		for (int[] group: students) {
			for(int studentsId: group) {
				System.out.println(studentsId);
			}
			System.out.println();
																		  
		}
		int [][] nums = {
				{10,20},//1
				{20,30,40,50},//2
				{100,200,300},//3
				{555,333,444,666,78}//4
				};
		for(int i=0; i<nums.length; i++) {
			for(int j =0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
