package day30methods02;


import java.util.Random;
import java.util.Scanner;

	public class myNumbers {
		public static void main(String[] args) {
			showMe5Numbers();
			showMe5Numbers();
			showMe5Numbers();
			showMe5Numbers();
			showMe5Numbers();
//			while(true) {this one will loop infinitely
//				showMe5Numbers();
//			}
			
			do10PushUps(); 
			do10PushUps();	
			rangePrint();
		}
		/**
		 method name: showMe5Numbers
	     return type: void
	     params: no
	     prints 5 random numbers 0, 1000
	     in same line separated by comma
	     Ex:
	     showMe5Numbers(); 345 233 566 2 23
		 */
		public static void showMe5Numbers() {
			Random r = new Random();
			for(int i = 1; i <= 5; i++) {
				System.out.print(r.nextInt(1001)+" ");//print random num 0-1000
			}
			System.out.println();//take it to new line
		}
		
		/*
		 * name: do10PushUps
		   return type: void
		   params: no
		   print:
		   Pushup - 1
		   Pushup - 2
		   Pushup - 3
		   ..
		   Pushup - 10
		   Time to rest
		 */
		public static void do10PushUps() {
			for(int j = 1; j <= 10; j++) {
				System.out.println("Pushup - " + j);
			}
			System.out.println("Time to rest");
			
			/*
			   method name: rangePrint
		       return type: void
		       params/args: no
		       Using a scanner ask for 2 integers.
		       you need to print all numbers between those to numbers.
			 */
		}
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		int num1 =0;
		int num2 =0;
		System.out.println("Enter 2 nums:");
		num1 = scan.nextInt(); //2
		num2 = scan.nextInt();//5
		  //5     //7 it will increase
		if(num1 < num2) {
			for(int j=num1; j<=num2; j++) {
				System.out.print(j +" ");// it will print 5,6,7,
			}
			        //10    //8 it will decrease
			}else if(num1 >num2) {// 
					for(int i=num1; i>=num2; i--) {//start from 6 until num2 is reached it will print backwords
						System.out.print(i +" ");
			}
			
		}else {
			System.out.println(num1);
		}
		System.out.println();
	}
	
}