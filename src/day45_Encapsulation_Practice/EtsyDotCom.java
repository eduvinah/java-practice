package day45_Encapsulation_Practice;

public class EtsyDotCom {

	public static void main(String[] args) {
		
	etsyAccount acct1 = new etsyAccount();
	System.out.println(acct1.toString());
	acct1.setEmail("pumev@mrmail.info");
	acct1.setFirstName("Pumev");
	acct1.setPassword("bulgaria123");
	
	System.out.println(acct1.toString());
	
	etsyAccount acct2= new etsyAccount();
	acct2.setEmail("helivaroyalhost.info");
	acct2.setFirstName("helireva123");
	acct2.setPassword("abc12");
			
			System.out.println(acct2.toString());
			
			etsyAccount acct3 = new etsyAccount("pumev@mrmail.info",
			"Helireva", "1234");
			System.out.println(acct3.toString());
			
			etsyAccount acct4 = new etsyAccount("wodent@gmail.com","wdSpoon");
			System.out.println(acct4.toString());
			
//			final String password ="me2yxh";
//			password = "abc123";

			}

}
