package day57_Interfaces;

public class Dog implements Pet, Callable{

	@Override
	public void respond() {
		System.out.println("Dog is responding woof-woof");
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog is kept in the house or outside");
	}

}
