package Day36_WrapperClasses;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//declare arrayList called languages
		
		ArrayList <String> lang = new ArrayList<>();
		
		lang.add("spanish");
		lang.add("Russian");
		lang.add("Englis");
		lang.add("Italian");
		lang.add("Turkish");
		lang.add("Azerbaijani");
		
		System.out.println("Number of values "+lang.size());
		lang.add("Frensh");
		System.out.println(lang.size());
		
		

	}

}
