package day50_Inheritance03;

public class Geogle extends SearchEngine {
	
	public int search(String item) {
		System.out.println("google Searching for : " + item);
		int resultCount = item.length();
		return resultCount;
	}
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items : " + item + ", " + item2);
		int resultCount = item.length()+ item2.length();
		
		System.out.println("total cound: "+ resultCount);
	}
	 public 
	 String clickResult() {
		System.out.println("clicking result ");
		return "search result page"; 
		
	}
}
