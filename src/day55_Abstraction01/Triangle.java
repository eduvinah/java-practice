package day55_Abstraction01;

public class Triangle extends Shape{
/*
 * 5.1,create no arg constructor and call super class's one arg constructor for
	 * Circle add 1 arg to set radius,Trial 3 args set length 6,In Circle class add
	 * radius field. and use this field to calculate your area in your calculate are
	 * method 7,in Triangle class add leng1,leng2,leng3 and calculate your area
	 * according to the each side of triangle. 9, Implement the abstract methods in
	 * both class to provide detail
	 * 
	 */
	
	double length1;
	double length2;
	double length3;
	
	
	public Triangle() {
		super("Triangle");
		
	
	}
	
	public Triangle(double length1, double length2, double length3) {
		super("Triangle");
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	
	}

	@Override
	public double calculateArea() {
		double p = (length1 + length2 + length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
	}


	@Override
	public void draw() {
		System.out.println("     *  \n" + 
				"    ***\n" + 
				"   *****\n" + 
				"  *******\n" + 
				" *********");
	}
}
