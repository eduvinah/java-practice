package day15_String_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf('g')); //0
		System.out.println(word1.indexOf("th"));//2 : will only give number even though is taking two.
		System.out.println("hub");//3
		System.out.println("java");
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("pos of . : "+ index);
		System.out.println(url.charAt(index+1));// +1 will give me the letter after
	
		String title = "Java - Google Search";
		int dash = title.indexOf('-');
		System.out.println(title.charAt(dash-2));// moves one position back. 
		System.out.println(title.charAt(dash+2));
	
		String country = "United states of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: "+states);
		 String word2 = "java, c++, python, tomcat, eclipse";
		 // it is does not find the word it will print -1
		 if (word2.contains("c++")) {
		 System.out.println("c++ is there");
	}else {
		 System.out.println("c++ is not there");
		 
		  if (word2.indexOf("c++")>-1) {
		System.out.println("c++ is there");
	
	 }else {
		 System.out.println("c++ is not there");
		
	}
	}
	}
}

