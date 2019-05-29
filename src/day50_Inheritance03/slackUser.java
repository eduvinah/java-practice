package day50_Inheritance03;

public class slackUser {
	private String name;

	public slackUser(String name) {
		this.name = name;
	}

	public void sendAMessage(String message) {
		System.out.println(name + " is sending a message <" + message + ">");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}