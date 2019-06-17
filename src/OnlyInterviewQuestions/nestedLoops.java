package OnlyInterviewQuestions;

public class nestedLoops {
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

//for (int o = 1; o <= 8; o++) {
//	for (int h = 1; h <= o; h++) {
//		System.out.println(star);
//	}
//	System.out.println(" ");
//}


