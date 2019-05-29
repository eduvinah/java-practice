package day51_Inheritance_exercise;

public class swimming extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("swimming ");
		return minutes * 11;

	}
}
