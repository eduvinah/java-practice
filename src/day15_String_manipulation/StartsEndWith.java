package day15_String_manipulation;

public class StartsEndWith {

	public static void main(String[] args) {
	String word1 = "eclipse";
	System.out.println(word1.startsWith("e"));
	System.out.println(word1.startsWith("ec"));
	System.out.println(word1.startsWith("ecli"));
	System.out.println(word1.startsWith("Ec"));
	
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("lipse"));
	System.out.println(word1.endsWith("java"));
	
								//ECLIPSE     
	System.out.println(word1.toUpperCase().endsWith("PSE"));
	
	//Mr ==> man
	//married woman
	//Ms ==some woman
	//Dr. ==> doctor woman, man.
	String name= "Dr. Jackson";
	if (name.startsWith("Mr.")) {
	System.out.println("man");
	}else if(name.startsWith("Mrs.")) {
	System.out.println("Married woman");
	
	
	}else if(name.startsWith("MS.")) {
		System.out.println("some woman");
	}else if(name.startsWith("Dr.")) {
		System.out.println("Doctor man or woman");
	}
		

}
}