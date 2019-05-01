package day13_ternary_string_intro;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		int Score = 88;
	//	if (Score>60) {
			result = "pass";
		
	//	}else {
	//		result = "fail";
			
		//}
		result = Score >60 ? "pass" : "fail";
		System.out.println("result is "+ result);
		
	}

}
