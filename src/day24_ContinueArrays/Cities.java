package day24_ContinueArrays;

public class Cities {

	public static void main(String[] args) {
		// creat an array that can store string variables with cities names.
		String[] cities = { "Washington D.C", "Kiev", "Annandale", "Moscow", 
				"Istanbul", "Baku", "Miami","Silver Spring", "Mcclean" };

		System.out.println(cities.length);
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		// same thing using for loop
		for(String city: cities) {
			if(city.startsWith("W")) {
				System.out.println(city);
			}
		}
	}

}
