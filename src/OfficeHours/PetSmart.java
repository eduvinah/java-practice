package OfficeHours;

public class PetSmart {
	
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.breed = "persian cat";
		cat1.name = "Bars";
		
		
			sellCat(cat1);
			
			OnlineCat cat2 = new OnlineCat();
			cat2.breed = "lebanese";
			cat2.name = "Tars";
			cat2.location = "Arlington TX";
			
			sellCatOnline(cat2);
			
			cat1.makeSomeNoise();
			cat2.makeSomeNoise();
	}
	
	public static void sellCat(Cat cat) {
		System.out.println("selling "+cat.breed);
		System.out.println("selling "+cat.name);
	}
	
	public static void sellCatOnline(OnlineCat cat) {
		
		System.out.println("selling "+cat.breed);
		System.out.println("selling "+cat.name);
		System.out.println("It's location is "+cat.location);
	}

}
