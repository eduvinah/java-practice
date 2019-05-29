package day51_Inheritance_exercise;

public class JuiJitsu extends Exercise{
	
	@Override
	public int perform(int minutes) {
		System.out.println("doing JuiJitsu ");
		return  minutes * 12;
	}
}
