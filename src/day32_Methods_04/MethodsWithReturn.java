package day32_Methods_04;

public class MethodsWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		
		int i=giveMe10$();
		System.out.println("i: "+i);
		String N= "Maria";
		System.out.println(N);
		

	}
	// this method, returns int value
	public static int giveMe10$() {
		System.out.println("returning 10 from method");	
		return 10;
	}
	/*
	 * giveMeYourName()
	 * return type: String
	 * declare name variable and assign your name 
	 * then return it
	 */
	public static String giveMeYourName() {
		return "Maria";
		
	}
}
