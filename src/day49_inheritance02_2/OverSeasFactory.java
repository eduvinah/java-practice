package day49_inheritance02_2;

import day49_Inheritance02.*;

public class OverSeasFactory {
// NON - SUB CLASS IN DIFFERENT PACKAGE
	public static void main(String[] args) {
		
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "2300"; not visible only in sub classes
		//dv.price = 100; not visible
		//dv.country = "el salvador"; not visible 
	}

}
