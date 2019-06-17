package day61_Polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {
	public static void main(String[] args) {

		AppleDevice appdev = new Ipad();
		// appDev can access use method startingPrice variable

		appdev.use();
		// appdev.draw(); no accessible
		// how to draw method from ipad.
		Ipad ipad = (Ipad) appdev;
		ipad.use();
		ipad.draw();
		
		AppleDevice dev2 = new Mac();
			dev2.use();
			
			//1. using another referece variable
			Mac mac = (Mac) dev2;
			mac.code();
			
			// cast and call single statement
			
			((Mac) dev2).code();
			
			//String str = (String) dev2; they are not related to inheritance
			
			
	}
}