package day22_StringAndLoopReview;

public class CatsAndDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mycatyourcat";
		// count how many cats.
		int cats = 0;
		for(int  i =0; i<=str.length()-3; i++ ) {
			System.out.println(str.substring(i,i+3));
			if(str.substring(i,i+3).equals("cat")) {
				
			}
		}
		System.out.println("cats: "+cats);
	}

}
