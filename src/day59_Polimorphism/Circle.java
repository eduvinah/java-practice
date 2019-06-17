package day59_Polimorphism;

public class Circle extends Shape{
	@Override
	public void draw() {
System.out.println("    * * *    \n" +
	               " *         * \n" +
	               "*           *\n" +
	               "*           *\n" +
	               "*           *\n" +
	               " *         * \n" +
	               "    * * *  ");
	}
}
