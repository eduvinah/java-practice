package day50_Inheritance03;

public class TestAnimal {
	public static void main(String[] args) {
		
	
	Animal ani = new Animal();
	Cat cat = new Cat();
	Dog dog = new Dog();
	Duck duck = new Duck();
	
	ani.speak();
	cat.speak();
	dog.speak();
	duck.speak();
	ani.move(3);
	cat.move(30);
	dog.move(34);
	duck.move(56);
	
}
}