package day49_Inheritance02;

public class Leopard extends Animal{
		
	public Leopard() {
		super(); //call parent class no args constructor
		System.out.println(" Leopard constructor sub class");
		setType("Leopard");
	}
	public Leopard(String type) {
		super(type); // call animal (String type) constructor
		System.out.println("Leopard one- arg constructor");
		
	}
}
