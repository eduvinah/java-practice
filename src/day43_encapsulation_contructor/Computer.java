package day43_encapsulation_contructor;

public class Computer {

	private String brand;
	private String OS;
	private double price;

	public Computer() {
		System.out.println("Computer constructor ");
		brand = "unknown";
		OS = "unknown";

	}
	
	public Computer(String brand, String OS, double price) {
		System.out.println(" In 3 args contructor");
		this.brand = brand;
		this.OS = OS;
		this.price = price;
		
	}
	public String toString() {
		return "Computer [brand=" + brand + ", OS=" + OS + ", price=" + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
