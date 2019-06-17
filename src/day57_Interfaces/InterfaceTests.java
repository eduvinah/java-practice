package day57_Interfaces;

public class InterfaceTests {
	public static void main(String[] args) {

		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		t.charge();
		i8.charge();

		t.selfDrive();
		i8.charge();
		
		Cat cat = new Cat();
		cat.keepAsPet();
		cat.play();
		Pet.feed("dry food");
		
	}
}
