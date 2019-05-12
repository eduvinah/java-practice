package day41_CustomClasseso02;

public class kitchen {

	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand = "Lg";
		mic.turnOn();
		mic.heat("Pizza with mushroom&anchovies");
		mic.turnOff();
	}

}
