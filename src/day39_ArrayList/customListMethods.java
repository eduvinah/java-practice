package day39_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class customListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList); // all of the above numsList is going to be assign to nums in line #20

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);
		double sum1 = sumList(doubleList);
		System.out.println("Sum: " + sum1);

		// for(;;) { infinite loop with random numbers
		System.out.println(getRamdonList(20));

		List<Integer> rlist = getRamdonList(20);

		Collections.sort(rlist);
		System.out.println(rlist);

		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list);

		List<String> strNums = new ArrayList<>();
		strNums.add("234");
		strNums.add("24");
		strNums.add("23");
		strNums.add("214");
		List<Integer> converter = convertToIntList(strNums);
		System.out.println(converter);
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> dList) {
		double sum = 0;
		for (double d : dList) {
			sum += d;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int w = 1; w <= size; w++) {
			newList.add(w);
		}
		return newList;
	}

	public static List<Integer> getRamdonList(int size) {
		Random rand = new Random();
		List<Integer> randomNums = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			randomNums.add(rand.nextInt(101));
		}
		return randomNums;
	}

	/*
	 * convertToIntList Return type: List<Integer> Param: List<String> It will take
	 * each string and convert to Integer and return as Integer list List<String>
	 * strL = new ArrayList<>(); strL.add("56"); strL.add("99");
	 * convertToIntList(strL); => [56, 99]
	 */
	public static List<Integer> convertToIntList(List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for (String str : strList) {
			newList.add(Integer.parseInt(str));
		}
		return newList;
	}
}
