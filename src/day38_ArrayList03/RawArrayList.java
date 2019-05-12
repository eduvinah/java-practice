package day38_ArrayList03;
import java.util.*;
public class RawArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		String allValues = list.toString(); // this way also works
		System.out.println(allValues); // or this
		System.out.println(list); // automatically call toString
		
		String str = list.get(0).toString();
		System.out.println(str);
		
		Integer i = (Integer) list.get(0);
		System.out.println(i);
		
		// all values are stored as raw type. we can also call it, 
		// as a general object type
		
		
	}

}
