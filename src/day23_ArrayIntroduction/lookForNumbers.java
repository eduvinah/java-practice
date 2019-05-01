package day23_ArrayIntroduction;

public class lookForNumbers {

	public static void main(String[] args) {
		for(int i = 1; i<=50; i++) {
			if(i % 5 ==0) {
				continue;
			}
			if(i % 21 ==0) {
				break;
			}
			System.out.print(i+" ,");
			
		}

	}

}
