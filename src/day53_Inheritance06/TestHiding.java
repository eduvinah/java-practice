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
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
	//==============================
		
		City city2 =new City(333, "Fairfax");
		Capital capital2 = new Capital(3423,"Richmond", 324543);
		
		city2.letsBuildARoad();
		capital2.letsBuildARoad();
		
		
	}
}
