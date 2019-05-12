package day40Custom_Classes_Methods;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	public void call() {
		System.out.println("Calling "+ name+"....");
	}
	public void txt() {
		System.out.println("Sending Msg to "+ phoneNumber + " | name: "+name);
	}
	public void sendEmail() {
		System.out.println("Sending email to " + email+"...");
	}
}

