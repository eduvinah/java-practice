package day57_Interfaces;

public class Cat implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("cat is responding miouw moiuw");
	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
	}

}
