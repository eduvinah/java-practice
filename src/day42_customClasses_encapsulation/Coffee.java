package day42_customClasses_encapsulation;

public class Coffee {

	String name;
	String size;
	double price;
	int calories;

	public void getCoffeeInfo() {
		String info = "Coffee name: " + name.toUpperCase() + " size " + size.toUpperCase() + " price $" + price
				+ " Cal " + calories;
		System.out.println(info);

	}
	// setter 
	// another advantagesof using setter methods can be checking if data is valid. if 
	// it is valid. then assign to instance variable, 
	public void setName(String newName) {
		name = newName;
	}

	public void setsize(String newSize) {
		if(newSize.equalsIgnoreCase("Tall")|| newSize.equalsIgnoreCase("grande")||
				newSize.equalsIgnoreCase("Venti")) {
			size = newSize;
		}else {
			System.out.println("invalid size");
			size = "Unknown";
		}
		
	}

	public void setPrice(double newPrice) {
		price = newPrice;

	}

	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setsize (newSize);
		
		price = newPrice;
		calories = newCal;
		
	}
}
