package OfficeHours;

public class CreatePeopleHere {

	public static void main(String[] args) {
		// when we construct certain actions are
		// being taken during the process of creating the object

		Person john = new Person("01/01/200");
		System.out.println(john.getBirtday());

		john.setFirstName("John");
		john.setLastName("Doe");
		

		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirtday());

		john.setFirstName("Smith");
		
		System.out.println(john.getBirtday());

	}

}
