package day46_static_keyword;

public class Campus {
	
	String city;
	static String country;
	static {
		System.out.println("static block");
		country = "USA";
	}
	public Campus(String sity) {
		System.out.println("Constructor");
		this.city = city;
		
	}
	public static void CampusInfo() {
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
