package Day36_WrapperClasses;

public class Boxing {

	public static void main(String[] args) {
		//AUTOBOXING -- > primitive > object
		
		Integer num1 =1234;
		int n = 5; 
		Integer num2 = n;
		// UNBOXING  --> object . primitive
		 Double d1 = new Double (34.2);
		 Double d2 = d1;
		 
		 System.out.println(d1);
		 System.out.println(d2);
		 
		 long l1 = new Long(600000); // unboxing 
		 Long l2 = new Long (23848448L); // no boxing 
		 long l3 =  12;// unboxing 
		 Long l4 = (long) 13; // outo-boxing 
		 
		 Integer num3 = Integer.valueOf(345);
		 //Double d3  = num3 - casting is not possible with wrapper classes
		 
		 
		 
		 
	}

}
