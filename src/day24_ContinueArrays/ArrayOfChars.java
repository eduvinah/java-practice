package day24_ContinueArrays;

public class ArrayOfChars {

	public static void main(String[] args) {
		char [] values = {'a','b','c'};
		for (char value: values) {
				System.out.print(value);
		}

	System.out.println();
	
	String str = "Wooden spoon";
	// this method toCharArray() converts string into 
	//array of characters
	char [] chars = str.toCharArray();
	for (char c: chars) {
		System.out.print(c+ "_");
	}
	System.out.println();
	str ="";
	for ( int i=chars.length-1; i>=0; i--) {
		System.out.print(chars [i]);
		str +=chars [i];
	}
	System.out.println(str);
	
	//task
	//print characters wih help of array of characters, one by one.
	//if characters is equals to 'o', replace with (print it instead of 'o') '*';
	
		for(char c: chars) {
			if(c=='o') {
				System.out.print("*");
				
			}else {
				System.out.print(c);
			}
		}
	}
}
