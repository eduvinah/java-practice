package day42_customClasses_encapsulation;

import java.util.Arrays;

public class Burger7 {
	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String[] ings = { "onion crisps", "american cheese", "pickles", "lettuce", "b7 sauce" };
		burger1.ingredients = ings;
		System.out.println(burger1.name);
		System.out.println(Arrays.deepToString(burger1.ingredients));
		//print ingredients
		System.out.println(burger1.ingredients[0]);
		
		//print all ingredients using a loop
		for(String ing : burger1.ingredients) {
			System.out.println(ing);
		}
	}
}
