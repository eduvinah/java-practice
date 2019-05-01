package day15_String_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
	String item= "java";
	String pageTitle = item +"- Google Search";
	
	if(pageTitle.startsWith(item)) {
		System.out.println("PASS: page title check passed");
		
	}else {
		System.out.println("Fail: page title check failed");
	}
	if (pageTitle.endsWith("Google Search")) {
	System.out.println("PASS: Google seach");
	
	}else { 
		System.out.println("Fail: page title check fail");
}
}
}