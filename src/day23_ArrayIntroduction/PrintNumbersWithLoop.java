package day23_ArrayIntroduction;

public class PrintNumbersWithLoop {

	public static void main(String[] args) {
		//outer loop
		for( int i = 1; i <=10; i++) {
			//inner loop
			for (int m=1; m<=i; m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		 for( int i = 10; i >=1; i--) {
			//inner loop
			for (int m=10; m>=i; m++) {
				System.out.print(m+" ");
			}
		}
	}
}


