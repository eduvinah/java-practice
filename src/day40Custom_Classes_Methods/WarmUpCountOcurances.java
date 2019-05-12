package day40Custom_Classes_Methods;

import java.util.ArrayList;

public class WarmUpCountOcurances {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("moon");
		myList.add("sun");
		myList.add("earth");
		myList.add("pluto");
		myList.add("saturn");
		myList.add("venus");
		myList.add("mars");
		myList.add("mars");
	
		
		String targetplanet = "moon";
		int count = countOccurance(myList, targetplanet);
		if (count == 2) { // if the planet moon appears 2 times test passes if it appears less times 
			// it fails
			System.out.println("unit test pass: count is 3,");
		} else {
			System.out.println("unit test fail:count " + count);
			System.out.println("Expected : 3");
			System.out.println("Actual: "+ count);
		}

	}


	// this is the first part then go to main method
	// [aa,aa,bb,jj,uu]
	public static int countOccurance(ArrayList<String> list, String planets) {

		int count = 0;
		for (String str : list) {
			if (str.equals(planets)) {
				count++;
			}

		}
		return count;
	}
}