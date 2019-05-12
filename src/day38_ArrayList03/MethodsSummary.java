package day38_ArrayList03;

import java.util.ArrayList;
import java.util.List;

public class MethodsSummary {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		
		// add method with index: "yellow will be placed to index 0'
		
		list1.add(0, "yellow");
		// toString method to print all values in same line
		System.out.println(list1.toString());
		//size methods.return number of values
		System.out.println("Number of elements "+list1.size());
		// get method. return value from index
		System.out.println("3: "+ list1.get(3));
		System.out.println("0: "+ list1.get(0));
		
		// remove using index. removes value from index position
		list1.remove(0); // removes yellow
		System.out.println(list1.toString());
		// remove using value/element. removes element first occuerence
		list1.remove("blue");
		System.out.println(list1.toString());
		// set (index) replace certain index with new value
		list1.set(0, "orange");// red will be replaced by orange
		//indeOf(value). returns index of value in the list
		System.out.println("grey "+ list1.indexOf("grey"));
		//isEmpty() returns true if  list is empty. size ==0
		System.out.println("is list empty? -"+ list1.isEmpty());
		System.out.println("is list empty? "+(list1.size()==0));
		//contains(ele) returns true if value is present
		System.out.println("white in list "+list1.contains("white"));
		
		
		List<String> list2 = new ArrayList<>();
		//AddAll ->add all values from one list into another
		list2.addAll(list1);
		System.out.println(list2);
		//contains all . check if list has all values of  another list
		System.out.println(list1.containsAll(list2));
		//equals. checks if all the values of list1 are in list2 (if two list are the same)
		System.out.println("equals: "+ list1.equals(list2));
		
		list2.add("pink");
		// removeall (list) removes all the matching values form your list that are the same
		list2.removeAll(list1);
		System.out.println("list2 after removeAll" + list2);
		System.out.println(list1);
		
		//addAll (index)add a new list values starting from five index
		list2.addAll(0, list1);
		System.out.println(list2);
		list1.clear();
		list2.clear();
		System.out.println("both empty? "+ (list1.isEmpty() && list2.isEmpty()));
		
		
		
		
		}

	}


