package day07_Scanner_operators;

public class EnoughPizza {

	public static void main(String[] args) {
// slices in pizza -> 8
		//slices per student -> 2
		int pizzacount = 40;
		int studentount = 145;
		boolean isEnoughPizza = pizzacount *8 >= studentount* 2;
		System.out.println( "Is enough pizza: " +isEnoughPizza);
	}

}
