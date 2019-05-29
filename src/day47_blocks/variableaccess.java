package day47_blocks;

public class variableaccess {
//instance variable
	int myInstanceVar =40;
	
	
	
	//static variable
	static int myStaticVariable = 55;
	public static void main(String[] args) {
		
		//System.out.println(myInstanceVar);
		// cannot access non-static from static method
		System.out.println(myStaticVariable);
	
		
		// create object of variableAccess and print myInstanceVar
		variableaccess v = new variableaccess();
		
	System.out.println(v.myInstanceVar);
	System.out.println(v.myStaticVariable);
	
	//access static variable using object
	System.out.println(v.myStaticVariable);
	System.out.println(variableaccess.myStaticVariable);
	}
}
