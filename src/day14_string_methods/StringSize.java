package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		if(str1.equals("Good Morning")) {
			System.out.println("match");
		}else {
			System.out.println("not match");
		}
if (str1.equalsIgnoreCase("Good Morning")) {
System.out.println("Match-ignore case");
	
	}else{
		System.out.println("not Match-ignore case");
	}
 System.out.println(str1.toUpperCase());
 System.out.println(str1);
 str1= str1.toUpperCase();
 System.out.println("After assignment: " +str1);
 if(str1.toLowerCase().equals("Good Morning")) {
	 System.out.println("Chained methods: match");
 }else {
		 System.out.println("Chainmethods: do not match");
 }
		 String myName = "Maria";
		 System.out.println(myName.length());
		 int length = myName.length();
		 System.out.println("my name's legnth: " +length);
		 
	 String userName= "Maria123";
	 if (userName.length ()==8) {
	 System.out.println("valid username");
	}else { 
		System.out.println("invalid User name");
	}
	 String password = "eduvina123";
	 if(password.length()>=6) {
		 System.out.println("valid password");
	 }else {
		 System.out.println("password too shorth");
	 }
	 
	 int passwordLength =password.length();
	 if (passwordLength<6){
	System.out.println("invalid password, too short");	 
	 }else {
		 System.out.println("valid password, good job");
	 }
	 }

	}



