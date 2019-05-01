package day30methods02;

public class EtsySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
		hola("como estas");
		jesus(1000);
	}
	public static void navigateToEtsy() {
		System.out.println("Launch chrome browser");
		System.out.println("navigate to www.etsy.com ");
}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden Spoon' in the search field ");
		System.out.println("click on 'search' botton");
}
	public static void printResults() {
			System.out.println("\"14,720 results\"");
}
	public static void hola(String hi) {
		System.out.println("muy bien y tu "+hi);
	}
	public static void jesus(int time) {
		System.out.println("viene pronto en "+time+" anos");
	}
		
	}


