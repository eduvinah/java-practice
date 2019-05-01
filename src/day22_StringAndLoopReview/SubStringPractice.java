package day22_StringAndLoopReview;

public class SubStringPractice {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,1));//ja
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		System.out.println("********************");
		int i=0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		
		System.out.println("#######################");
		
		for( int m =0; m<=3;m++) {
			//System.out.println(word.substring(m, m+1));
			
			String letter = word.substring(m, m+1);
			System.out.println(letter);
		
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			for (int j =3; j>=0; j--) {
				System.out.print(word.substring(j,j+1));
				//int start =
			}
		}
	}
}