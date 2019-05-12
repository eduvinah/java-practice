package day37_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cars =  new ArrayList<>();
		cars.add("Honda");
		List<Integer> nums = Arrays.asList(4,5,7,9);
		nums.size();
		System.out.println(nums.toString());
		
		
		List<Double> prices = Arrays.asList(6.7,56.7,200.3, 328.4, 45.4,32.4,4.5,67.5,4.5,19.2,2.4);// when you do it 
		// this way can add or do many changes
		System.out.println(prices);
		
		// calculate sun of all prices
		double sum =0;
		for(double price: prices) {
			sum += price;
			
		}
		System.out.println("Sum "+ sum);
		
		double sum2 =0;
		for(int i=0; i<prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("sum2: "+ sum2);
		
		
		// create new list expensive
		//add prices that are more than 100;
		
		List<Double> expensive = new ArrayList<>();
			for (double price:prices) {
			if(price >100.0) {
				expensive.add(price);
				
			}
			
		}
			System.out.println("Expensive: "+ expensive.toString());
			
	}

}
