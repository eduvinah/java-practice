package day07_Scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 10;//11
			int num2 = num++;//10
			System.out.println("num: " + num);
			System.out.println("num2: " + num2);
			int n = 20;//21
			int n2 = ++n;//21
			System.out.println("n2: " +n);
			System.out.println("n2: " +n2);
			
			int bananas = 6;//8
			int pears = bananas++;//6
			int apples = ++bananas;//8
			System.out.println("bananas: " +bananas);
			System.out.println("pears: " +pears);
			System.out.println("apples: " +apples);

			int friends = 10;//11
			System.out.println(++friends);
			System.out.println(friends);
			int p1 = 10;//11
			int sum = p1++ +5;//15
			System.out.println("sum: " +sum);
			System.out.println("p1: " +p1);
			
			int batteries = 8;//9
			int oldBatteries = 5;//6
			int totalBatteries = batteries++ + ++oldBatteries;
			System.out.println("batteries: " + batteries);
			System.out.println("oldBatteries:" + oldBatteries);
			System.out.println("totalBatteries:" + totalBatteries);
			
			
			
	}

}
