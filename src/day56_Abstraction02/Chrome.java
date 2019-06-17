package day56_Abstraction02;

public class Chrome extends Browser{
	
	public Chrome(String name, int id) {
		super(name, id);
	}
	public void navigate(String url) {
		System.out.println("Chrome - navigate to " + url);

	}

	@Override
	public void displayWebpage() {
		System.out.println("Chrome - displaying webage ");
	}

	@Override
	public boolean Launch() {
		System.out.println("Chrome is launching ");
		System.out.println("1 2 3");
		return true;
	}
	public void close() {
		super.Close();
		System.out.println("Existing Chrome");
	}
}
