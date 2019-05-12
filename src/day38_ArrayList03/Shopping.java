package day38_ArrayList03;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("shoes");
		shoppingList.add("purse");
		shoppingList.add("blouse");
		shoppingList.add("wallet");
		shoppingList.add("jeans");
		shoppingList.add("umbrella");
		
		int count = shoppingList.size();
		// print number of items
		System.out.println("Total count: " + count);

		// print allitems in single line
		System.out.println(shoppingList.toString());
		// print first and last item in single line
		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(count - 1));

		shoppingList.remove("wallet");
		System.out.println(shoppingList);

		System.out.println(shoppingList.get(0));

		System.out.println(shoppingList.toString());

		for (String item : shoppingList) {
			System.out.println(item);

		}
		// remove all items.
		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}

}
