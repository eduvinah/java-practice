package day50_Inheritance03;

public class App {
	private String name;
	private String developer;
	public static int count;
	

	public App(String name) {
		this.name = name;
	}
		public static void build(String language) {
			System.out.println("buidling an app using "+ language);
		}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
