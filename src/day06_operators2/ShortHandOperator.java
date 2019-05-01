package day06_operators2;

public class ShortHandOperator {
	public static void main(String[] args) {
		int students = 45;
		System.out.println("Students: " + students);
		
		students = students + 5;
		System.out.println("Students: " + students);
		
		students = students - 2;
		System.out.println("Students: " + students);
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		
		teachers += 2; // increase teachers by 2. 
		//teachers = teachers + 2
		System.out.println("Teachers: " + teachers);
		
		//teachers = teachers -5;
		teachers -= 5; // decrease teachers by 5
		System.out.println("Teachers: " + teachers);
		
		int cars = 12;
		System.out.println( "cars: " + cars);
         
		cars *= 2;// cars = cars * 2;
		System.out.println("cars: " +cars);
		
		cars += cars;
		
		System.out.println( "cars: " + cars);
		int shoes = 20;
		shoes /=4;
		System.out.println("shoes : " + shoes);
		
		double price = 45.50;
		 int amount = 5;
		 price +=amount;
		 System.out.println( price);
		 
		 int minutes = 66;
		 minutes %= 60;
		 System.out.println("reaining :" + minutes);
		 int pennies = 550;
		 pennies %=100;// pennies = pennies %100;
		 System.out.println("pennies left : " + pennies);
		 
		 int apples = 10;
		 apples =-3;
		 System.out.println(apples);
		 int count = 1;
		 count = count + 1;//2
		 count += 1;//3
		 
		 
		 
		 
	}
	
	

}
