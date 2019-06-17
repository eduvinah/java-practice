package day60_polymorphism02;

public class Ipad extends AppleDevice{
	public double  macscreensize = 12.9;
	@Override
	public void use() {
System.out.println("Ipad | listen to music | read book | cartton| ");		
	}
	public void draw() {
		System.out.println("drawing shapes using ipad");
	}
}
