package day56_Abstraction02;

public class Netscape extends Browser {

	@Override
	public void navigate(String url) {
		System.out.println("Netscape  - navigate to " + url);

	}

	@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaying webage ");
	}

	@Override
	public boolean Launch() {
		System.out.println("Netscape is launching ");
		System.out.println("1 2 3");
		return true;
	}
	public void close() {
		super.Close();
		System.out.println("Existing netscape");
	}
}
