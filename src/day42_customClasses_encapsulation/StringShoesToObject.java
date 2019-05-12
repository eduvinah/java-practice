package day42_customClasses_encapsulation;
import java.util.*;

public class StringShoesToObject {

	public static void main(String[] args) {
		
		
		String data = "Bruno Magli, 9.5";
		//take the string and create shoes objects with this data.
		
		
		// split using ',' and store into array
		String [] arrData = data.split(",");
		// create shoes object
		//shoes.setShesData(arrData[0], double.parseDouble(arrData[1])
		//parse is for when we want to convert data type to different one;
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in) ;
			System.out.println("what shoes brand?");
			String brand = scan.next();
			System.out.println("What is your size?");
			double size = scan.nextDouble();
			
			Shoes myshoes1 = new Shoes();
			myshoes1.setShoesData(brand, size);
			System.out.println(myshoes1.getShoesData());
		}
		
	}


