package day38_ArrayList03;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2= list1; // list1, list2 point to same object
		ArrayList<String> months = new ArrayList<>(list1); // copying all the values for list1
		System.out.println(months);
		
		months.add("Jun");
		months.add("July");
		months.add("August");
		months.add("Jun");
		
		boolean month = months.contains("Jan");
		System.out.println(month);
		System.out.println(months.contains("Dec"));
		
		// how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb")==1); // this one will work but if you clear the list all the suddent it will not give details
		
		
		// or
		System.out.println(months.get(1).equals("Feb"));
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		System.out.println("Month: "+ months.toString());
		System.out.println("month2 "+ month2.toString());
		
		//check if month has all the values of Month2
		if(months.containsAll(month2)) {
			System.out.println("all months are there");
		}else {
			System.out.println("not all months are there");
		}
		
		
		// add one more Jan to month2
		month2.add("Jan");
		if(months.containsAll(month2)) {
			System.out.println("all months are there");
		}else {
			System.out.println("not all months are there");
		
	}
	}
}
