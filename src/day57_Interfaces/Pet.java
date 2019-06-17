package day57_Interfaces;

public interface Pet {
	public static final boolean friendly = true;

	public abstract void keepAsPet();

	public default void play() {
		System.out.println("playing hide and seek with a pet");
	}
	// static methods in interface are not inherited to other classes.
	public static void feed(String food) {
		System.out.println("feeding the pet "+ food);
	}
}
