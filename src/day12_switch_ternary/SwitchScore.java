package day12_switch_ternary;

public class SwitchScore {

	public static void main(String[] args) {
		
		int score = 2;
		switch(score) {
			case 1:
			System.out.println("Score is 1");
			break;
			case 2:
				System.out.println("Score is 2");
				break;
			case 3:
				System.out.println("Score is 3");
				break;
				default:
					System.out.println("Invalid Score");
					break;
		}

	}

}
