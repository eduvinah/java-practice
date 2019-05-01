package day24_ContinueArrays;

import java.util.Scanner;

public class NestedLoopsPracticeFromVideos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Using Nested for loop
		int[] cols = { 1, 2, 3 };
		int[] rows = { 1, 2, 3, 4 };

		for (int row : rows) {
			System.out.println();

			for (int column : cols) {
				System.out.print("LRow " + row + "-Column " + column);
			}
		}
		// using While loop
		int row = 0;
		while (row < 5) {
			row++;
			System.out.println();
		}
		int col = 0;
		while (col < 3) {
			col++;
			System.out.println("Row " + row + "-Column " + col);
		}
	}
	// do the same with do while.
//			int row= 3;
//			int col = 4;
//	do {
//		System.out.println("Row "+ row+ "-Column "+ col);
//		
//		
//	}while(row ==3 & col ==4);
//		
//}
}