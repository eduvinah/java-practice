package day52_Inheritance05;

public class FinalMethods {

	public final void method1() {
		System.out.println("final mehtod 1");

	}
}

class sub extends FinalMethods {
	// cannot override since it is final
//	public void method1() {
//		System.out.println("override method1"); 
	
	final public static void staticMethod(String word) {
		System.out.println("staticmethod: "+ word);
	}
	public void method1(String str) {
		System.out.println("override method1");
	}
	
//	final public static void staticMethod(String word) {
//		System.out.println("staticmethod: "+ word);
//	}
}