package day52_Inheritance05;

public class EqualsMethod {

	public static void main(String[] args) {
		Computer comp1 = new Computer("iMac","silver");
		Computer comp2 = new Computer("iMac","silver");
		Computer comp3 = comp2;// pointing to same object
		
		System.out.println(comp1==comp2);
		System.out.println(comp1.equals(comp2));
		
		System.out.println(comp3==comp2);
		System.out.println(comp3.equals(comp2));
	}

}
