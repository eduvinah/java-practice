package day51_Inheritance_exercise;

public class running extends Exercise{

	public int perform(int minutes) {
		System.out.println("running ");
		return  minutes * 10;
	}
}
