package day51_Inheritance_exercise;

public class Exercise {
	/*
	 * public int perform(int minutes) "Doing general exercise" 4 calories per
	 * minute -> Running "Running" 10 cal/minute -> Swimming 11 cal/minute -> Yoga 5
	 * cal/minute -> JuiJitsu 12 cal/minute
	 * 
	 * perform(int minutes) 4 calories per minute
	 */


	public int perform(int minutes) {
		System.out.println("performing general exercise");
		return minutes * 4;

	}
}
