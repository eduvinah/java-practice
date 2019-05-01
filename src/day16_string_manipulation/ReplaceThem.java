package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		sentence = sentence.replace(",","!!!");
		System.out.println( sentence);
	
		String mixed = "&^#ja$-vla@#$";
		mixed = mixed.replace("&^#", "");
		System.out.println(mixed);
	mixed=	mixed.replace("$", "").replace("-","").replace("l","").replace("@","").replace("#", "")
		.replace("$", "");
		System.out.println(mixed);
		
		
		String result= "About 115,000,000 results (.59 seconds)";
		result = result.replace("About","");
		System.out.println(result);
		
		result=result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		result = result.replace(",","");	
		System.out.println(result);
	}

}
