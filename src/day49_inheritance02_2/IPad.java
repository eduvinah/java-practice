package day49_inheritance02_2;

import day49_Inheritance02.Device;

public class IPad extends Device {

	public void readEBook(String title) {
		System.out.println("reading a book" + title + " using " + brand + " tablet");
		System.out.println("Model - "+model);
		//System.out.println(price); notinherited not visible becasue it is default
	}
}
