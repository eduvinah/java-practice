package day50_Inheritance03;

public class AdminUser extends slackUser{


	public AdminUser(String name) {
		super(name);
	}

	@Override
	public void sendAMessage(String message) {
		System.out.println("@channel");
		System.out.println(getName() + " is sending a message <" + message + ">");
	}


}