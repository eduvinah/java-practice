package day50_Inheritance03;

public class Duck extends Animal {
	 public void speak() {
		 System.out.println("Duck is saying Quack quack quack");
	 }
	 public void move(int steps) {
			System.out.println("Duck is moving "+ steps+ " Steps");
		}
}
