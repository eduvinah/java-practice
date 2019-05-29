package day48_Inheritance;

public class Person {
	String name; 
	int age;
	char gender;
	
	public void eat(String food,String drink) {
		System.out.println(name+ " is eating "+food+" with "+drink);
	}
	public void walk() {
		System.out.println(name+ " is walking");
	}
	public void sleep(int hours) {
		System.out.println(name + " sleeps for "+ hours +" hours");
	}
}
