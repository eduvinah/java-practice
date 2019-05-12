package day37_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(44);
		numsList.add(42);
		numsList.add(2);
		numsList.add(434);
		numsList.add(45);
		System.out.println(numsList);
		
		
		System.out.println("Sorting please wait... ");
		Collections.sort(numsList);
		System.out.println(numsList);
		
		
		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Mario");
		strList.add("Dina");
		strList.add("Bojan");
		strList.add("Anastasia");
		
		System.out.println(strList);
		System.out.println("Sorting please wait");
		
		Collections.sort(strList);
		System.out.println(strList);
		
		//max, min
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		System.out.println(maxNum);
		System.out.println(minNum);
		
		String strList1 = Collections.max(strList);
		String strList2 = Collections.min(strList);
		System.out.println(strList1);
		System.out.println(strList2);
		
		Collections.shuffle(strList);
		System.out.println(strList);
	}

}
