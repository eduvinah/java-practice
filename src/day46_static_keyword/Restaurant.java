package day46_static_keyword;

public class Restaurant {

	public static void main(String[] args) {
		
		Dinner Mom = new Dinner ();
		
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("Total slice:  "+Dinner.pizzaSlices);
		
		Dad.takeSlice();//7
		kid.takeSlice();//6
		Mom.takeSlice();//5
		System.out.println("Total slice:  "+Dinner.pizzaSlices);
		
		System.out.println("Total slices " +Dad.pizzaSlices);
		
		kid.takeSlice(3);//2
		Dad.takeSlice(2);//0 no more for mom
		//Mom.takeSlice();
		
		System.out.println("Total slices: "+Mom.pizzaSlices);
		System.out.println("total slcies "+Dinner.pizzaSlices);
	}

}
