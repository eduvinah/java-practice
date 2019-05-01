package day13_ternary_string_intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which type of car you are interested in?");
		System.out.println(" 1) American \n 2) Japenese \n 3) German \n 4) Italian\n 5)Korean");
		int carType = input.nextInt();
		
		double averagePrice=0.0;
		String carOptions = "";
		String carOrigin ="";
		
		switch (carType) {
			case 1:
				averagePrice = 3300.0;
				carOptions ="Ford, Dodge, Tescla, Chevrolet, Lincoln";
				carOrigin = "American";
				break;
			case 2:
				averagePrice = 3200.0 ;
				carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
				carOrigin = "Japanese";
				break;
			case 3:
				averagePrice= 55000.0;
				carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
				carOrigin = "German";
				 break;
			case 4:
				averagePrice= 25000.0;
				carOptions= "Kia, Hyundai, Daewoo";
				carOrigin = "Korean";
				break;
			case 5: averagePrice =85000.0;
				carOptions= "Alfa Romeo, Ferrari, :amborghini, Fiat";
				carOrigin = "Italian";
				break;
				
				default:
				System.out.println("Car type not avaliable");
				return;//stop execution. dont run rest of code.

	}
		
		System.out.println("You selected " +carOrigin+ " car and your options are " +carOptions);
	System.out.println("Average Price: "+averagePrice );
	}

}

