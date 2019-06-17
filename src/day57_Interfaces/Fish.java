package day57_Interfaces;

public class Fish implements Pet{

	@Override
	public void keepAsPet() {
		System.out.println("Fish is kept in fishTank with water and food");
	}

}
