package day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][] countriesArray = { 
				{ "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "lima" }, { "Argentina", "Buenos aires" }, { "Bolivia", "La paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" }
				};
		System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));

		// print all the countries in same line separated by |

		for (int i = 0; i < countriesArray.length; i++) {

			System.out.print(countriesArray[i][0] + "|");
		}
		// for each loop
		System.out.println("#########FOR EACH LOOP#########");
		for (String[] country : countriesArray) {
			System.out.println(country[0]+"|");
			
			
		}
		//get all the cities and add to cities [] array
		//declare cities array and size needs to match country array size
		//String [] cities = new String [9]; it will not work if a new city is added
		
		String [] cities = new String [countriesArray.length];
		// null is nothing is not the same as "" string 
		
		for (int i=0; i<countriesArray.length; i++) {
			cities [i] = countriesArray [i][1];//====> 1 go to [i] "0" and then it will go to the cities of each country and assign it to cities[i]
			System.out.println(Arrays.deepToString(cities));
			//loop for Bolivia in the countryArr and test if capital city is "La Paz";
			
			for (int j=0; j<countriesArray.length; j++) {
				if(countriesArray[j][0].equals ("Bolivia")) {
					//System.out.println(countriesArray[j][1]);
					if(countriesArray[j][1].equals("La Pa")) {
						System.out.println("Bolivia test passed");
					}else {
						System.out.println("Bolivia test failed");
						
					}
					break;
					//after finding the right question exit the look and has to be after the }curly brace the
					//close the else. 
				}
				
			}
			
		}
		
		
	}
}
