package day08_casting_conditionals;

import java.util.Scanner;

public class Main {
  //YOUR CODE HERE 
	public static void main (String [] args){
  	Scanner scan = new Scanner(System.in);
  	
  	System.out.println("Enter your area code: " );
	int areaCode= scan.nextInt();
	
	System.out.println("Enter your local numbe" );
	int localNumber= scan.nextInt();
    
    String phoneNumber = "("+areaCode+")" +"-" + localNumber;
   System.out.println("Calling number " + phoneNumber);

  
}	}


