package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
	String str2 = "java";
	System.out.println(str1==str2);
	
	System.out.println(str1=="java");
	
	System.out.println(str2=="Java");
	
	System.out.println(str1.equals("str2"));
	
	System.out.println(str1.equals("java"));
	
	System.out.println(str1.equals("Java"));
	
	String month = new String ("March");
	
	String month2 = new String("March");
	
	System.out.println( month == month2);
	
	System.out.println(month.contentEquals(month2));
	
	System.out.println(month.equals("March)"));
			
	}

}
