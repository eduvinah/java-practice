package day25_Arrays03;

public class Shopping {

	public static void main(String[] args) {
		String [] products = {"Timberland shoes", "H$M Shirt", "Swatch Watch","Gucci Bag", "Adidas socks"};
		double [] prices = {120.0, 5.99, 150.50, 3000.50, 6.99};
		int [] itemsId = {12345,12346, 12347,12348,12349};
		
			System.out.println("Products count: "+products.length);
			if (products.length==prices.length && products.length==itemsId.length) {
				System.out.println("shopping list looks good ");
			}else {
				System.out.println("Something is wrong with this list");
				return;
			}
			// for each loop
			for (String p :products) {
				System.out.println(p);
				
			}
			// prices --> for loop
			// {"Timberland shoes", "H$M Shirt", "Swatch Watch","Gucci Bag", "Adidas socks"};
			for (int i =0; i< prices.length; i++) {
				System.out.println(prices [i]);
			}
			//itemsId --> reverse order/
			
			System.out.println(itemsId [itemsId.length-1]);
				
			for (int j = itemsId.length-1; j>=0; j--) {
				System.out.println(itemsId [j]);
			}
			// print a report. with a total price.
			
			
			
			System.out.println("###########YOUR SHOPPING RECEIPT#########");
			
			double totalPrice = 0.0;
			
			for (int idx = 0; idx <products.length; idx++) {// instead of using products I could have use prices, or itemsid and it would work the same way. 
				
				
			System.out.println("Item: "+(idx+1)+": "+itemsId [idx]+ " - "+products [idx]+ " - $"+prices [idx]);
			totalPrice+= prices[idx];
			}
			System.out.println("Total Price: $"+totalPrice);
		
			//find the most expensive item in your list and print it as a report.
			
			int maxIndex = 0; //
			double maxPrice = 0;
			
			for (int i =0; i<prices.length; i++) {
				
				if (prices[i]>maxPrice) {
					maxPrice = prices [i];
					maxIndex=i;
					System.out.println(itemsId[maxIndex]+ " - "+ products[maxIndex]+ " - $"+maxPrice);
				}
				}
				int minIndex = 0;
				double minPrice= Integer.MAX_VALUE; //prices[0]
				
				for (int j=0; j<prices.length; j++) {
					if(prices [j]<minPrice) {
						minPrice = prices [j];
						minIndex = j;
						
					}
				}
				System.out.println(itemsId [minIndex]+ " - "+ products [minIndex]+ " - $" +minPrice);
			
			
}
}