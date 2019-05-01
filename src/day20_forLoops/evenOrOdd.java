package day20_forLoops;

public class evenOrOdd {

	public static void main(String[] args) {
		int evens;
		int odds;
		// using for loop print 1-100'
		// print all even numbers.
		for(int num =1; num<=100; num++) {
			if(num%2==0) {
				System.out.print(num+" ");
			}
			//print all odd numbers in same line
			for(int j=1; j<=100; j++) {
				if(j%2!=0) {
					System.out.print(j+" ");
				}
				System.out.println();
				int sumOfOdds=0;
				int sunOfEvens =0;
				
				for(int num1 =1; num1 <=100; num1++) {
					if(num%2==0) {
						sunOfEvens +=num1;
						
					}else {
						sumOfOdds+=num1;
					}
				}
				System.out.println("Sum of evens: "+sunOfEvens);
				System.out.println("Sum of odds: "+sumOfOdds);
			}
		}
		
	}

}
