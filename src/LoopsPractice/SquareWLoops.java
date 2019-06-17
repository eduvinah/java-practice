package LoopsPractice;

public class SquareWLoops {
	public static void main(String[] args) {
		String star = "*";
		
		for (int i = 1; i <= 8; i++) {

			for (int j = 1; j <= i; j++) {
					System.out.print(star);

				}
			System.out.println(" ");
			}

		}

	}
  // this is what will print the two loops
//* 
//** 
//*** 
//**** 
//***** 
//****** 
//******* 
//******** 


