package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		//declare muldD array with 2 rows and 6 cols
		String [][] teams = new String [2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitry";
		
		System.out.println("First player of first tema:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);// Habib
		System.out.println(teams[1][5]);// Dmitry
		 
		// print how many rows/teams/arrays
		
		System.out.println("Number of rows: "+ teams.length);
		System.out.println("People of in first team: "+teams [0].length);
		System.out.println("People of in first team: "+teams [1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		int [][] States = new int [3][4];
		States[0][0] = 100;
		States[0][1] = 34534;
		States[0][2] = 343242;
		States[0][3] = 256;
		
		States[1][0] = 256;
		States[1][1] = 64556;
		States[1][2] = 343242;
		States[1][3] = 999576;
		
		States[2][0] = 456;
		States[2][1] = 34534;
		States[2][2] = 343242;
		States[2][3] = 256;
		
		System.out.println(Arrays.deepToString(States));
		System.out.println(Arrays.toString(States[0]));
		
		int [][] scores = {{3,5,10}, {6,4,2,10}};
		
		System.out.println("Days played/Number of arrays: "+scores.length);
		System.out.println("Number of values in 1:"+scores[0].length);
		System.out.println("Number of values in 2:"+scores[1].length);
		
		
		int [][] values = new int[4][];
		values [0] = new int [] {34,25,63};
		values [1] = new int [] {52,65,32,2,59,86,45,48};
		System.out.println("Number of values in 1: "+values.length);
		
		values [2] = new int [2]; //0,0
		values [2][0] = 55;
		values [2][1] = 88;
		
		values [3] = new int [] {12,45,25,63,55,};
		
		System.out.println(Arrays.deepToString(values));
	}

}
