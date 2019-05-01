package Day36_WrapperClasses;

import java.util.ArrayList;

public class PracticeWithArrayList {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("Orange");
		lst.add("Banana");
		lst.add("Sapote");
		lst.add("Longan");
		lst.add("Mango");
		lst.add("Red Currant");
		
		
		// get the names of all items in the list
		System.out.println(lst);
		
		// check the total of items in the list
		System.out.println(lst.size());

		// getting elements by get(index)
		System.out.println("firts element " + lst.get(0));
		System.out.println("last element " + lst.get(6));

		// check if items exists in the list contains(item)
		System.out.println(lst.contains("apple"));
		System.out.println(lst.contains("coco"));

		// getting the index of item by the value indexOf(item)
		System.out.println(lst.indexOf("Banana"));
		System.out.println(lst.indexOf("apple"));

		// checking if ArrayList isEmpty

		System.out.println(lst.isEmpty());

		// setting the value for certain index
		lst.set(1, "coco");
		System.out.println(lst);

		// removing item by value
		lst.remove("Banana");
		System.out.println(lst);

		// removing item by index
		lst.remove(0);
		System.out.println(lst);
		
		// removing all the items in the list
		lst.clear();
		System.out.println(lst);
		

	}

}
