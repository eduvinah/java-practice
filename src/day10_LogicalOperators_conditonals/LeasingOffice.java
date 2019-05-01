package day10_LogicalOperators_conditonals;


import java.util.*;

public class LeasingOffice {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;
    //WRITE YOUR CODE HERE
    if (numberOfBedrooms== 1){
      System.out.println("One Bedroom Selected");
      startingPrice= scan.nextInt();
		
    }
    else if(numberOfBedrooms== 2){
    System.out.println("two Bedroom Selected");
    startingPrice= scan.nextInt();
    }
    else if(numberOfBedrooms== 2){
    System.out.println("two Bedroom Selected");
    startingPrice= scan.nextInt();
      
    }
    else if(numberOfBedrooms== 3){
    System.out.println("two Bedroom Selected");
    startingPrice= scan.nextInt();
    
    }else{
       System.out.println("No such Bedrooms available");
       System.out.println("Starting Price:" + startingPrice);
    }
    
  }
}