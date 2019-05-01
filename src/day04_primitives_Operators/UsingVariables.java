package day04_primitives_Operators;

public class UsingVariables {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1=100;
		num2=num1;
		System.out.println(num1);
		System.out.println(num2);
		num2=200;
		num1=num2;
		num3=num1;
		System.out.println(num1);
		System.out.println(num2);
		
		//declare apples and assign 25
		//declare kiwis and assign value of apples to it
		//declare mangoes and 55
		//declare mangoes to kiwis 
		
		int apples=25;
		int kiwis=apples;
	    int mangoes=55;
	     kiwis=mangoes;
	    System.out.println(apples);//25
	    System.out.println(kiwis);//55
	    System.out.println(mangoes);//55
	    
	    

	}

}
