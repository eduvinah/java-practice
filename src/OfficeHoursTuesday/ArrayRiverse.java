package OfficeHoursTuesday;

import java.util.Arrays;

public class ArrayRiverse {
	public static void main(String[] args) {

		String[] arr3 = new String[4];
		System.err.println(Arrays.toString(reverse(arr3)));

	}

	public static String[] reverse(String[] arr) {
		String[] arr2 = new String[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[index] = arr[i];
			index++;

		}
		return arr2;
	}
}
