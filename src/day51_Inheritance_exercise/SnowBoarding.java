package day51_Inheritance_exercise;

public class SnowBoarding extends Exercise {

	public int perform(int minutes) {
		int cals = super.perform(10);// call super class version of perform
		System.out.println("snow boarding for " + minutes + " minutes");
		return minutes * 7 + cals;
	}
}
