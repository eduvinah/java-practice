package day28_multid_arrays;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.*;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " + data.length);
		// print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		// print last restaurant
		System.out.println(data[data.length - 1]);

		// print each restaurant information on separate line
		int counter = 0;
		for (String rest : data) {
			System.out.println("#" + counter + "=> " + rest);
			counter++;
		}
		// print all restaurant information in state of VA also count how many and print
		// it the number
		int countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
			}
		}
		System.out.println("#####Total restaurants:############ " + countVA);
		// find all restaurant information in state of VA
		// print restaurant name along with city name

		for (String restaurant : data) {
			if (restaurant.contains(",VA,")) {
				String[] restArr = restaurant.split(",");
				System.out.println(restArr[2] + "-" + restArr[1]);
			}

		}
	}
}