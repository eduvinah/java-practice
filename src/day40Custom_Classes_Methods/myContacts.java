package day40Custom_Classes_Methods;

public class myContacts {

	public static void main(String[] args) {
		
		// create contact object
		
		Contact Evgenia = new Contact();
		Evgenia.name= "Evgenia Jalilova";
		Evgenia.phoneNumber = "202-333-44444";
		Evgenia.email = "Evgenia@thorlabs.com";
		
		
		Evgenia.call();
		Evgenia.txt();
		Evgenia.sendEmail();
		
		Contact Orhan = new Contact();
		Orhan.name = "Orhan Sultanow";
		Orhan.phoneNumber = "(273) 989- 3454";
		Orhan.email= "Orhan@google.com";
		
		System.out.println("Name: "+ Orhan.name);
		System.out.println("phone number : "+ Orhan.phoneNumber);
		System.out.println("email : "+ Orhan.email);
	
		Orhan.call();
		Orhan.txt();
		Orhan.sendEmail();
		
		Evgenia.call();
		
		
				
	}

}
