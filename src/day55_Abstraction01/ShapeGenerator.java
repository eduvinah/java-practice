package day55_Abstraction01;

public class ShapeGenerator {

	public static void main(String[] args) {
		Circle circle1 = new Circle(4);
		System.out.println("calculated area of circle: "+circle1.calculateArea());
		circle1.draw();
		Triangle triangle1 = new Triangle(4,5,6);
		triangle1.draw();
		System.out.println("Area: "+ triangle1.calculateArea());
	}

}
