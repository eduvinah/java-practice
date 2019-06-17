package day61_Polymorphism03;

import day43_encapsulation_constructor.Tesla;
import day49_Inheritance02.TV;
import day50_Inheritance03.IphoneApp;
import day60_polymorphism02.*;

public class MethodsUsinPolymorphism {
	public static void main(String[] args) {
		purchase(new Mac());// this is like saying --> AppleDevice ap = new Mac();
		AppleDevice dev = new Watch();
		purchase(dev);
		giveMeAnyObject(new String("Watch"));
		giveMeAnyObject(new TV());
		giveMeAnyObject(new Tesla());
		giveMeAnyObject(90);// auto box to Integer
		giveMeAnyObject(new String("Hi"));
		
		AppleDevice dev1 = buildAppleDevice();
		dev1.use();
	}

	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing " + ap.getClass().getSimpleName().toUpperCase());

	}

	public static void giveMeAnyObject(Object obj) {
		System.out.println("You gave me: " + obj.getClass().getSimpleName());
	}

	public static AppleDevice buildAppleDevice() {
		// AppleDevice ap = new Ipad();
		// return ap;
		// we can return object from mac, Ipad, watch classes.
		return new Ipad();
	}

	/*
	 * in order to understand polymorphism i ned to know inheritance hierarchy
	 * AppleDevice > Ipad > Watch >Mac by looking at the hierarchy above , it means
	 * we can write methods that return or accept AppleDevice and pass any object
	 */

	public static AppleDevice buidlDevice(String type) {
		if (type.contentEquals("ipad")) {

			return new Ipad();

		} else if (type.equals("mac")) {
			return new Mac();
		} else if (type.contentEquals("watch")) {
			return new Watch();
		} else {
			return null;
		}
	}

}