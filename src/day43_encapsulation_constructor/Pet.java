package day43_encapsulation_constructor;

public class Pet {

	private String name;
	private String type;
	
	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public Pet() {
		System.out.println("no-Args contructor");
	}
	public void speak() {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Miuw");
			break;
		case "dog":
			System.out.println("ga gav | woof woof ");
			break;
		case"bird":
			System.out.println("chik chirik");
			break;
			case"goat":
			case "sheep":
				System.out.println("bhaaa bhaaaa");
				break;
			case "rooster":
				System.out.println("u uruuuu");
				break;
			default:
				System.out.println("-....-");
				
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + "]";
	}

	}


