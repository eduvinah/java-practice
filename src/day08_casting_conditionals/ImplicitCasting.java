package day08_casting_conditionals;

public class ImplicitCasting {
public static void main(String [] args) {
	//automatic casting from smaller to larger.
	short shortValue = 3455;
	int intValue = shortValue;
	System.out.println( "int value:" +intValue);
	
	
	double price = 345;
	System.out.println("Price after casting:"  +price);
	
	int price1 = 34521;
	double dprice =price1;
	
	System.out.println("dPrice after casting:"  +dprice);


}
}
