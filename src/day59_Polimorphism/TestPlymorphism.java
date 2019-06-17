package day59_Polimorphism;

public class TestPlymorphism {
	public static void main(String[] args) {
		Bank b = new SBI();
		//b.getRateOfInterest(); this way works but the one from below is better bc it prints the result
		System.out.println("rate for SBI: "+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("rate for ICICI: "+ b.getRateOfInterest());
		b = new AXIS();
		System.out.println("rate for AXIS: "+b.getRateOfInterest());
	}
}
