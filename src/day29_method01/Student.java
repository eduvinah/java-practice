package day29_method01;

public class Student {

	public static void main(String[] args) {
		sayHello();
		study();
		study();
		study();
		code();
	}

	public static void study() { // study is the name of the method
		System.out.println("Student is studying");
	}

	// create a method say hello
	public static void sayHello() {
		System.out.println("Hello friends!");
		System.out.println("How are you today?");
	}

	// create a name method
	// "Inside code method"
	// "Student is coding Java"
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
	
}
