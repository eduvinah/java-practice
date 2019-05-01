package day32_Methods_04;

public class Cooking {

	public static void main(String[] args) {

		makePancakes();
		makePasta();
		cook("Omellete", " eggs, salt, tomatoes, green pepers, onions");
	}

	public static void cook(String dish, String ingredients) {
		System.out.println("~~~" + dish.toUpperCase() + " Recipe~~");
		add(ingredients);
		System.out.println("Cook it");
		System.out.println("~~" + dish.toUpperCase() + "Recipe");
		// we could also check value of dish and call matching method
		// if(dish.equals("pancakes")) {
		// makePancakes();
		// }

	}

	public static void makePasta() {
		System.out.println("##### Italian Pasta ########");
		add("Water, salt, olive oil,");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("parmesan cheese, marinara");
		System.out.println("~~~~~~~~~~DELICIOUS PASTA IS READY~~~~~~~~~~~~~");
	}

	public static void makePancakes() {
		System.out.println("^^^^^^PANCAKES RECIPE^^^^^^^");
		add("Milk, eggs, flour, sugar, salt");
		mix(120);
		fry(3);
		System.out.println("********ENJOY YOUR DELICIOUS PANCAKES******");

	}

	public static void add(String ing) {
		System.out.println("Add something " + ing);
	}

	public static void mix(int s) {
		System.out.println("mix for " + s + " seconds");
	}

	public static void fry(int min) {
		System.out.println("fry for " + min + " min");
	}

	public static void boil(int min) {
		System.out.println("Boil for " + min + " minutes");

	}
}