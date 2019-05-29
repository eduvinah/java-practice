package day43_encapsulation_constructor;

public class TeslaDealerV2 {

	public static void main(String[] args) {
		TeslaV2 tesla = new TeslaV2();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
	System.out.println("MODEL: "+tesla.getModel());
	System.out.println("range: "+tesla.getRange());
	System.out.println("zeroto60: "+tesla.getZeroTo60());
	System.out.println("Price "+ tesla.getPrice());
	System.out.println("selfDriving "+ tesla.isSelfDriving());
	
	System.out.println(tesla);//outomatically calling toString
	System.out.println(tesla.toString());
	
	Tesla myTesla = new Tesla();
	myTesla.setTeslaInfo("roaster", 620, 1.9, 250000, true);
	System.out.println(myTesla);
	}
}


