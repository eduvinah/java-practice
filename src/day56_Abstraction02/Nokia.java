package day56_Abstraction02;

public class Nokia extends MobilePhone{

	@Override
	public void text(String message) {
		System.out.println("Nokia sending msg: "+ message);
	}

	@Override
	public void call() {
		System.out.println("nokia sending msg: ");
		
	}
}
