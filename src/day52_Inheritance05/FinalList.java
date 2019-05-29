package day52_Inheritance05;

import java.util.*;

public class FinalList {

	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("ORANGE");
		COLORS.add("GREY");
		COLORS.add("WHITE");
		COLORS.add("BLUE");
		
		System.out.println(COLORS.toString());
		COLORS.add("BLACK");
		System.out.println(COLORS.toString());
		
		
//		COLORS = new ArrayList<>();
//		System.out.println(COLORS.toString());
	}

}
