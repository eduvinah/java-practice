package day55_Abstraction01;

public abstract class Animal {

	private String name;
	
	public abstract void speak();// we cannot have abstract method in regular classes
	public abstract void eat();
	
	
	// dog speak: woof woof
	// cat speak: miau, miau;
	// pig speak: aink oink;\\
	// we can habe regular methods (non-abstract) in the abstract class
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
