package day34_methods06;

public class MethodOverLoading {

	public static void main(String[] args) {
		add(10, 90);
		add(3.4, 5.7);
		add("one", "two");

	}

	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result " + result);
	}

	public static void add(double num3, double num4) {
		double result = num3 + num4;
		System.out.println("Result " + result);
	}

	public static void add(String str1, String str2) {
		String result = str1 + str2;
		System.out.println("Result " + result);
	}
}