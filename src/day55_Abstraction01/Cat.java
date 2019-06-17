package day55_Abstraction01;

public class Cat extends Animal {

	@Override
	public void speak() {
		System.out.println("the cat speaks this way Meowwww");
	}

	@Override
	public void eat() {
System.out.println(getName()+"cat is eating");		
	}

}
