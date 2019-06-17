package day60_polymorphism02;

import day59_Polimorphism.Shape;

import java.util.ArrayList;
import java.util.List;

//import day59_Polimorphism.Triangle;
import day59_Polimorphism.*;

public class ShapesArray {

	public static void main(String[] args) {

		Shape shape = new Triangle();
		shape.draw();// overriden version of draw is called
		
		System.out.println(shape.getClass().getName().toUpperCase());
		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };
		Shape[] shapes2 = new Shape[3];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();
		
		shapes[0].draw();
		shapes2[2].draw();
		shapes2[1].draw();
		
		System.out.println("**********FOR EACH LOOP***********");
		for(Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
	List<Shape> shapesList = new ArrayList<>();
	shapesList.add(new Triangle());
	shapesList.add(new Circle());
	shapesList.add(new Square());
		
		shapesList.get(0).draw();
		
		Shape someShape = shapesList.get(1);
		someShape.draw();
		
		System.out.println("********** new for each for arrayList **********");
		
		for(Shape shapeItem : shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
		}
		System.out.println("####### FOR LOOP WITH LIST OF SHAPES ##########33");
		for(int i=0; i< shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
			shapesList.get(i).draw(); // this step is also doing the same as line 52.
		}
	}
}
