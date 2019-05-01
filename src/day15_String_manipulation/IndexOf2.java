package day15_String_manipulation;

public class IndexOf2 {

	public static void main(String[] args) {
		//index of with 2 inputs.
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash:" + firstDash);
		
		int secondDash= list.indexOf("-",5);//look for dash pero start from #5 (S)
		System.out.println("Second dash: "+secondDash);
		 
		int thirdDash = list.indexOf("-",secondDash+1);
		System.out.println("thirdDash: "+thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: "+lastDash);
		//lasIndexOf ==> can be used when we search for last position of the character/string.
	}

}
