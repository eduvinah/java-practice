package day15_String_manipulation;

public class Contains {

	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		String list = "potatoes, apples, tomatoes, eggs, mild, bread,cereal,meat";
		if(list.contains("apples")) {
		System.out.println("apples are there");
		}else {
		System.out.println("lets add apples now");	

	}
		boolean hasEggs= list.contains("eggs");
		System.out.println("contains eggs: "+hasEggs);
		
		boolean hasCucumber =list.contains("cucumber");
		System.out.println("contains cucumber: "+ hasCucumber);
		
		email= "name@yahoo.com";
		if(email.contains("yahoo")) {
		System.out.println("It is yahoo email");
	}else if(email.contains("Gmail account")) {
	System.out.println("Hotmail account");
	
	}else if(email.contains("@hotmail")) {
		System.out.println("Hotamil account");
	}
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains("|")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		 String name = "Maria";
				 if(name.contains("a")||name.contains("e")) {
					 System.out.println("name has 'a' or 'e'");
				 }else {
					 System.out.println("'a' or 'e' is not present");
				 }
				 String name2= "Elizabeth";
				 if(name2.contains("z")&& name2.contains("h")); {
					 System.out.println("does it have 'z' and 'h'");
				 }
		}
	}



