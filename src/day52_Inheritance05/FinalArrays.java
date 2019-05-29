package day52_Inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		
	final int[] TEAMS = new int[]{11,11};
	System.out.println("Team1: " + TEAMS[0]);
	System.out.println("TEAM2: "+ TEAMS[1]);
	TEAMS[0] = 10;
	TEAMS[1] = 9;
	System.out.println("Team1: " + TEAMS[0]);
	System.out.println("TEAM2: "+ TEAMS[1]);
	
	int[] nums = new int [] {23,45,34};
	System.out.println(Arrays.toString(nums));
	
	nums = new int [] {23,454,334};
	System.out.println(Arrays.toString(nums));
	
	final int[] finalNums = {23,34,56};
	System.out.println(Arrays.toString(finalNums));
	finalNums[0] =30499;
	System.out.println(Arrays.toString(finalNums));
	
	final double[] prices = new double[3];
	prices[0] =85.5;
	prices[1] =84.5;
	prices[2] =89.5;
	
	System.out.println(Arrays.toString(prices));
	prices[0] = 598.5;
	
	//prices = new prices[3]; will not work bc i am creating a brand new array
	
	
	
	
	}
}
