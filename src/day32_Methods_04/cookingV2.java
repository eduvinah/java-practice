package day32_Methods_04;

public class cookingV2 {

	public static void main(String[] args) {
		add("tomato, onions, spaggetti,");
		mix(40);
		fry(30);
		boil(50);
		tortillas();
		makeSoup();
		
		
		
	}
	public static void makeSoup() {
		System.out.println("~~Delicious Chicken souP~~~~~");
		add ("water, onions, garlic, cilantro,chicken");
		boil(40);
		add("other decired begetables");
		boil(20);
		add("salt, and condiments");
		
		
	}
	public static void tortillas() {
		System.out.println("^^^HOMEMADE TORTILLAS^^^");
		add("water, corn flour,");
		mix(2);
		System.out.println("***SERVE THEM WITH THE DELICOUS SOUP***");;
	}
	public static void add(String ing) {
		System.out.println("Add! "+ ing);
		
	}
	public static void mix(int sec) {
		System.out.println("mix for! "+ sec +" seconds");
		
}
	public static void fry(int min) {
		System.out.println("cook for! "+ min+ " mins");
	}
	public static void boil(int mins) {
		System.out.println("boil for! "+ mins+" mins");
}
}
