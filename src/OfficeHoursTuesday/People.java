package OfficeHoursTuesday;

public class People {

	String hardToGet = "Nursultan";
	
    static String easyToGet = "Muhtar"; // when calling it i can call through the class name 


	public void sayMyName() {
		System.out.println(hardToGet);
	}
	public static void whatMyNmae() {
		System.out.println(easyToGet);
		
		//next line will throw error because 
		//static method cannot call non static
		//System.out.println(hardToGet);
	}

	}


