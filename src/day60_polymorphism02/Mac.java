package day60_polymorphism02;

public class Mac extends AppleDevice {
	public String model =" Mac computer";
	@Override
	public void use() {
		System.out.println("Mac | computer| code | read book | check email");
	}
	public void code() {
		System.out.println("coding ");
	}
	
}
