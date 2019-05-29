package day44_Constructors02;

public class Email {
	String message;
	public Email(String message) {
		
		System.out.println("Send email with message: "+ message);
		this.message = message; 
	}
}
