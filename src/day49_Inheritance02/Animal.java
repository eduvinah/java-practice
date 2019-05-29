package day49_Inheritance02;
		
public class Animal {

	private String type;
	//super()
	public Animal() {
		System.out.println("Animal constructor");
		type = "undifined";
		
	}

	public Animal(String type) {
		System.out.println("Animal 1 arg constructor");
		this.type = type;
	}
	public String getType() { 
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
