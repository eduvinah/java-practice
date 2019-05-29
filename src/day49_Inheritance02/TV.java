package day49_Inheritance02;

	//TV is a sub class in the same package
public class TV extends Device {
	
	public void watch() {
		System.out.println("Watching tv - "+brand+" model: "+model);
		System.out.println("Price : "+price); 
		//System.out.println("made in "+ country ); not visible
		
	}
	
}
