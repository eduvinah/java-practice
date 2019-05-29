package day43_encapsulation_constructor;

public class MicroCenter {

	public static void main(String[] args) {

		Computer comp1 = new Computer();
		Computer comp2 = new Computer();

		System.out.println(comp1.toString());
		System.out.println(comp2.toString());

		comp1.setBrand("iMac");
		comp1.setOS("MacOS High Sierra");
		comp1.setPrice(2567);

		comp2.setBrand("Dell XPS");
		comp2.setOS("Windows 10");
		comp2.setPrice(1300);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		Computer comp3 = new Computer("Asus",  "Windows 7", 645.5);
		System.out.println(comp3.toString());
		// change OS of comp3
		// I can use set for this
		comp3.setOS("Windows 11");
		System.out.println(comp3.toString());
		//you got $200  discount.
		comp3.setPrice(comp3.getPrice()-200);
		System.out.println(comp3.toString());
	}

	
}
