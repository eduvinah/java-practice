package day59_Polimorphism;

public class AnimalShow extends Animal{

	public static void main(String[] args) {
		Animal a = new Animal();
		//polymorphism: reference anima, object tyger, chetah, zebra.
		Animal tiger = new Tiger();
		Animal c = new Chetah();
		Animal someAnimal = new Zebra();
		
		a.talk();
		tiger.talk();
		c.talk();
		someAnimal.talk();
		
		
		Animal [] animals = new Animal [3];
		animals[0] = new Tiger();
		animals[1] = new Chetah();
		animals[2] = new Zebra();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
		
	
	}

}
