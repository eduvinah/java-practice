package day56_Abstraction02;

public abstract class Browser {// if this abstract word is missing abstract methods wont work
	
	String name;
	static int id;
	
	public Browser() {
		System.out.println("creating a constructor with browser");
	}
	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean Launch();
	public void Close() {
		System.out.println("Existing the browser.....");
	}
	
}
