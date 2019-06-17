package day60_polymorphism02;

public class AppleStore {
	public static void main(String[] args) {

		AppleDevice mac = new Mac();
		mac.use();
		// mac.Code(); code is not visible
		// AppleDevicee methods can only be called
//	
//	Mac myMac = new Mac(); this is possible but is not polymorphic way. 
//	myMac.code();
//	myMac.use();

		
		AppleDevice watch = new Watch();
		watch.use();
		
		AppleDevice dev1 = new Mac();
		System.out.println(dev1.startingprice);
		//System.out.println(dev1.model); ERROR REference type decides what is visible
		
		AppleDevice dv2 = new Ipad();
		System.out.println(dv2.startingprice);
		//System.out.println(dv2.screensize()); ERROR
		Ipad ipad = new Ipad();
		System.out.println(ipad.startingprice);
		System.out.println(ipad.macscreensize);
	}
}
