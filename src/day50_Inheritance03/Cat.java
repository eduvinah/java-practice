package day50_Inheritance03;

public class Cat extends Animal{
	 public void speak() {
		 System.out.println("Cat is saying Miau Miau");
	 }
	 public void move(int steps) {
			System.out.println("cat is moving "+ steps+ " Steps");
		}
}
