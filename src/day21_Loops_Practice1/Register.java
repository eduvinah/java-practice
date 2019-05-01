package day21_Loops_Practice1;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Create a program called Register.
//
//		It will ask user how many items he purchased.
//
//		Then based on that number it will ask item name and price that many times.
//
//		You need to gather all items in one String variable items separated by comma
//
//		And calculate sum of each item price into variable totalPrice.
//
//		Then print out items and total price.
//
//		Example:
//
//		How many items are you purchasing?
		
		int price=0;
		double totalPrice =0.0;
		String item = "";

		System.out.println("Welcome, how many items are you purchasing today?");
		int itemsCount = scan.nextInt();
		
		for(int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item "+count +"?");
			
			String itemName = scan.next();
			System.out.println("How much is "+ itemName+ "?");
			double itemPrice= scan.nextDouble();
			//add item name to items and itemPrice to totalPrice.
			
			item += itemName+", ";
			totalPrice +=itemPrice;
			
			
		}
		if(item.endsWith(", ")); // get rid of comma.
		System.out.println("Your items: "+ item );
		System.out.println("Your total price: $"+totalPrice);
	}

}
