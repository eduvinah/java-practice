package day45_Encapsulation_Practice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setName("Java programming");

		List<String> javateachers = new ArrayList<>();
		javateachers.add("Vasyl");
		javateachers.add("Murodil");
		javateachers.add("Marufjon");
		javateachers.add("Muhtar");
		course1.setTeachers(javateachers);
		System.out.println(course1.toString());

		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Natalia");
		javaStudents.add("Adilet");
		javaStudents.add("Aigul");
		javaStudents.add("Urma");

		course1.setStudents(javaStudents);
		System.out.println(course1.toString());

		course1.addTeacher("Maria");
		course1.addTeacher("Ekaterina");
		// checking if teacher is there in the list
		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is there");
		} else {
			System.out.println("she is not there");
		}
		if (course1.getTeachers().contains("Murodill")) {
			System.out.println("He is there in the list");
		} else {
			System.out.println("Murodill not there");
		}

		if (course1.getStudents().contains("Natalia")) {
			System.out.println("She is there");
		} else {
			System.out.println("nope not there");

		}
		course1.removeStudent("Adilet");
		course1.removeTeachers("Roman");

		if (course1.getTeachers().contains("Adilet") == false) {
			System.out.println("Adilet is removed Successfully");
		} else {
			System.out.println("Adilet is still there");
		}
		course1.removeTeachers("Murodill");

		if (course1.getTeachers().contains("Murodill")) {
			System.out.println("Murodill no longer there");
		} else {
			System.out.println("Murodill still there");
		}
	}
}
