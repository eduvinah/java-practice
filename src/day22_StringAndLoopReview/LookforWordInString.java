package day22_StringAndLoopReview;

public class LookforWordInString {

	public static void main(String[] args) {
		String sentence= "He said hi, then she replied hi. hi guys!";
		//print letters in pairs.
		//he,
		//e
		//s
		//
		int count =0;
		for (int i = 0; i<sentence.length()-1; i++) {
			String temp = sentence.substring(i,i+2);
			if(temp.equals("hi")) {
				count++;
			}
		}
				System.out.println("Count"+count);
			}
		}
	
