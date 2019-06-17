package day58_Interfaces;

public class ClassA implements Cloneable {
	@Override
	public Object clone() {
		System.out.println("cloning");
		return null;
	}
}
