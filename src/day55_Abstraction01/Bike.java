package day55_Abstraction01;

public class Bike extends Vehicle {

	public Bike(int wheels, double price) {
		super(wheels, price,"Bicycle", "a person");
	}

	@Override
	public void move() {
		System.out.println("cycling");
	}

}
