package day37_arrayList;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("tejutepeque");
		
		for(String list:cities) {
			System.out.print(list +" ");
		}
		for(int i=0; i<cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
			
		}
		System.out.println();
		// remove Baku
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println("Removing Baku");
		
		//isEmpty
		System.out.println("Is list empty "+ cities.isEmpty());
		
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());// the old first one is moved one space so Bishkek can take the first pl
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		//find Sterling in the list and give the index
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: "+idx);
		
		cities.set(idx, "Zareb");
		System.out.println(cities.toString());
		
		cities.clear();
		//boolean empty = cities.isEmpty();
		System.out.println(cities.isEmpty());
		
		
		
	}

}
