package day46_static_keyword;

public class Dinner {

	public static int pizzaSlices =8; 
	
	public void takeSlice() {
		pizzaSlices --;
		
	}
	public void takeSlice(int count) {
		pizzaSlices -= count;
		
	}
}
