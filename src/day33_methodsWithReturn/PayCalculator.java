package day33_methodsWithReturn;

public class PayCalculator {
	
	public static void main(String[] args) {
		int pay = gerHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay);
		System.out.println(gerHourlyPay(0,10));
		int noPay = gerHourlyPay (10,0);
		
		System.out.println("noPay "+noPay);

	}

	public static int gerHourlyPay(int hours, int rate) {
		if (hours <= 0) {
			System.out.println("Invalid hours");
			return 0;// will exit the method and return 0

		}

		if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;

		}
		int totalPay = hours * rate;
		return totalPay;
	}
}
