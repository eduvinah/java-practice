package day40Custom_Classes_Methods;

import java.util.ArrayList;

public class macBook {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("moon");
		myList.add("earth");
		myList.add("mars");
		myList.add("saturn");
		myList.add("pluto");
		myList.add("moon");
		myList.add("moon");
		
		String targetWord = "moon";
		int count = countOccurances(myList, targetWord);
		if(count==3) {
			System.out.println("unit pass");
			System.out.println("Actual is 3");
		}else {
			System.out.println("did not pass");
		}
	}

//[aa, aa,bb,jj, yy]
	public static int countOccurances(ArrayList<String> list, String word) {
		int count = 0;
		for (String str : list) {
			if(str.equals(word))
			count++;
		}
		return count;
	}
}