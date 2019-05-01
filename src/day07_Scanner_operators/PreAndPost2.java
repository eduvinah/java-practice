package day07_Scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int messages = 10;
		messages++;//11
		++messages;//12
		System.out.println("messages: " +messages);
		int readMessages = --messages;
				System.out.println("ReadMessaages:" + readMessages);
		
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages: " +unreadMessages);
		System.out.println("readMessages: " +readMessages);
		int total = unreadMessages++ - readMessages--;
		System.out.println();
		
		 int count = 20;
		 int count2 = 10;
		 int totalCount = ++count + --count2;
		 System.out.println("count: " +count);//21
		 System.out.println("count2: " +count2);//9
		 System.out.println("totalCount: " +totalCount);//30
		 
		 int myCount = count ++ + ++count;
		 System.out.println("count: " +count);
		 System.out.println("myCount: " + myCount);
	}
}
		 
		 
