package day57_Interfaces;

public class Tesla extends Vehicle implements Electric,Automonous {

	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station");
		
	}
	public void selfDrive() {
		System.out.println("Tesla is in pilot mode. Driving autonomously");
	}

}
