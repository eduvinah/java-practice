package day53_Inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(234, "London");
		Capital cap = new Capital(233, "Paris", 234455L);
		System.out.println(city.count);
		System.out.println(city.count);
		
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
	}
}
