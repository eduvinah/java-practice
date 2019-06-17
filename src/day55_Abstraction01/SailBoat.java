package day55_Abstraction01;

public class SailBoat extends Vehicle{
	
	private int length;
	
	public SailBoat(double price, int length) {
		super(0, price, "sailBoat", "wind");
		this.length = length;
	}

	@Override
	public void move() {
		System.out.println("Sails....");
	}

	public int genLength() {
		return length;
	}
}
