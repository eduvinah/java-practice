package day42_customClasses_encapsulation;

public class myCoffees {

	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		
		
		coffee1.name = "ICED CARAMEL MACHIADO";
		coffee1.size = "grande";
		coffee1.price= 4.75;
		coffee1.calories = 250;
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA Chip");
		coffee2.size = "VENTi";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		coffee2.getCoffeeInfo();
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		coffee3.setName("ICED COFFEE"); //coffee3.name = "Iced coffee";
		coffee3.setsize ("TALL");
		coffee3.setPrice (2.45);
		coffee3.setCalories(60);
		
		System.out.println("Coffee3 name: " + coffee3.name);
		coffee3.getCoffeeInfo();
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeeInfo();
		
	}
}
