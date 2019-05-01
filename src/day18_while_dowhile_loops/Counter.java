package day18_while_dowhile_loops;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		//1,3,4,5,6,7,8,9,10
		int num = 1;
		
		while(num<=10) {
		System.out.print(num+", ");
		num++;
		Thread.sleep(100);// pause the code execution for a second and 
		//the throws interruptedException will learn later.
	}
		System.out.println("\n num value after loop "+num);
		
		int num2 = 11;
		while (num2>=1) {
			System.out.print(num2+", ");
			num2--;
			Thread.sleep(456);
		}
		System.out.println("num2: "+ num2);
	}
}
