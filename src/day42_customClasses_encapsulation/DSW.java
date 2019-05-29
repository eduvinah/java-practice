package day42_customClasses_encapsulation;

import java.util.*;

public class DSW {

	 public static void main(String[] args) {
	        
	        ShoesArray shoes1= new ShoesArray();
	        shoes1.setShoesData("ALDO",7.5);
	        System.out.println(shoes1.getShoesData());
	        
	        ShoesArray shoes2= new ShoesArray();
	        shoes2.setShoesData(" Allen Edmonds",6.5);
	        
	        ShoesArray shoes3= new ShoesArray();
	        shoes3.setShoesData("BOSS HUGO BOSS",9.0);
	        
	        ShoesArray[] shoesArray = new ShoesArray[3];
	        shoesArray[0] = shoes1;
	        shoesArray[1] = shoes2;
	        shoesArray[2] = shoes3;
	        
	        System.out.println(shoesArray[0].getShoesData());
	        System.out.println(shoesArray[1].getShoesData());
	        System.out.println(shoesArray[2].getShoesData());
	        
	        System.out.println(shoesArray[0].brand);
	        System.out.println(shoesArray[1].brand);
	        System.out.println(shoesArray[2].brand);
	        
	        //arrayList pf shoes
	        
	        ArrayList<ShoesArray> myShoes = new ArrayList<>();
	        myShoes.add(shoes1);
	        myShoes.add(shoes2);
	        myShoes.add(shoes3);
	        
	        System.out.println(myShoes.get(0).getShoesData());
	        System.out.println(myShoes.get(1).getShoesData());
	        System.out.println(myShoes.get(2).getShoesData());
	        
	        //print only size
	        System.out.println(myShoes.get(0).size);
	        System.out.println(myShoes.get(1).size);
	        System.out.println(myShoes.get(2).size);
	        
	        ShoesArray redShoes = myShoes.get(1);
	        System.out.println(redShoes.getShoesData());
	        
	        //lets use for loop 
	        
	        for(ShoesArray shoes : myShoes) {
	            System.out.println("shoes report: " +shoes.getShoesData());
	        }
	        //print name of shoes in the list that size is more than 7
	        
	        for(ShoesArray shoes:myShoes) {
	            if(shoes.size>7) {
	                System.out.println("size more than 7: " + shoes.getShoesData());
	            }
	        }
	    }
	}
