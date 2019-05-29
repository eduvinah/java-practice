package day42_customClasses_encapsulation;

public class PersonEncap {
	//declare name and age encapsulated data
	
	private String name; // name #1
	private int age;
	// this is only visible here in this class bc it is private
	
	//public getter and setter method
	//  read only
	
	public String getName() {
		return name;
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//write only - void no return
	public void setName(String name) { // #2 name
		this.name = name;
		this.age = 12;
	}
}
