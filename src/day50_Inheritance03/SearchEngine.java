package day50_Inheritance03;

public class SearchEngine {

	public int search(String item) {
		System.out.println("Searching for : " + item);
		int resultCount = item.length();
		return resultCount;
	}

	protected void search(String item, String item2) {
		System.out.println("Searching for : " + item + ", " + item2);
		int resultCount = item.length()+ item2.length();
		
		System.out.println("total cound: "+ resultCount);
	}
	String clickResult() {
		System.out.println("clicking result ");
		return "search result page";
		
	}
}