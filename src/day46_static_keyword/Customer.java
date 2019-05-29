package day46_static_keyword;

public class Customer {

	
	private  String name;
	private String email;
	
	static int count; // by adding static it will share count to all customers.
	//share by everyone/all objects.
	// one central copy of this variable
	//
	public Customer() {
		name = "undefined";
		email = "undefined";
		count++;
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
