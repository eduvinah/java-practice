package day23_ArrayIntroduction;

public class ArrayWithString {

	public static void main(String[] args) {
		String[] names = new String[5];
		String[] names2 = {"Shaun","Roman", "Burak","Vlad", "MARIA"};
		System.out.println(names2[4]);
		System.out.println("Number of items: "+names2.length);
		String [] countries = {};
		//array has fixed size
		countries[0] = "USA";
		String [] fruits = new String [] {"apple","orange"};
		//for each loop stands for collections of data
		//we need specify data type, variable name: our collection of data
		//for each loop
		//or enhance loop
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		}
	}


