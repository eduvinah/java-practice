package day60_polymorphism02;

import day59_Polimorphism.*;

public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle();
		// getClass().getSimpleName() method

		System.out.println(shape.getClass().getName());

		if (shape.getClass().getSimpleName().equals("triangle")) {
			System.out.println("it is triangle");

		} else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("it is cirlce");
		} else if (shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("it is square");
		}
		System.out.println(shape instanceof Square);// instanceof gives true or false;
		System.out.println(shape instanceof Triangle);
		System.out.println(shape instanceof Circle);

		System.out.println(shape instanceof Shape);

		if (shape instanceof Triangle) {
			System.out.println("it is a triangle!");
			shape.draw();
		} else if (shape instanceof Circle) {
			System.out.println("it is a circle!");
			shape.draw();
		} else if (shape instanceof Square) {
			System.out.println("it is a square!");
			shape.draw();
		}
		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };

		int circle = 0, square = 0, triangle = 0;
		// using for each loop find out number of each type.
		for(Shape sh: shapes) {
			if(sh instanceof Circle) {
				circle++;
			}else if( sh instanceof Triangle) {
				triangle++;
				
			}else if(sh instanceof Square) {
				square++;
			}
		}
		System.out.println("count of each shape is "+"\n"+"circle: "+circle+"\n"+"triangle: "+triangle+"\n"+"square: "+square);
	}
}
