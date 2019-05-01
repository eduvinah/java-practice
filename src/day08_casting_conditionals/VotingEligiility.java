package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligiility {

	public static void main(String[] args) {
        /*
         program to tell if you are eligible to vote
         votingAge = 18
         yourAge = take from scanner 
         if you are eligible to vote 
         your are eligible to vote
         you have been eligible for 3 years. 
         else
         you are not eligible to vote
         you still have 3 more years to go
         
         */
		Scanner scan = new Scanner(System.in); 
			int votingAge =18;
			System.out.println("How old are you?");
			int yourAge = scan.nextInt();
			int years = yourAge - votingAge;
			if(yourAge >= votingAge) {
				
			}
				if (yourAge>=votingAge) {
				System.out.println("Your are eligible to vote.");
				System.out.println("your have been eliglibe for "+years+" years");
			}else {
				System.out.println("you are not eligible to vote");
				System.out.println("you still have" +(yourAge-votingAge)+" more years to go");
			}
					

			
		}
	}


