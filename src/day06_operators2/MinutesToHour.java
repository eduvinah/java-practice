package day06_operators2;

public class MinutesToHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a int variable minutes
		//using arithmetic operators, find out how many hours and remaining minutes are there 
		//hours, remainingMinutes
		//print "5hours and 10 minutes"
		int minutes = 120;
		int hours = minutes/60;
		int remainingMinutes = minutes%60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		System.out.println(hours + " hours and " + remainingMinutes+ " minutes");


	}

}
