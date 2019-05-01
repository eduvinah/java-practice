package day17_Strinpool_whirpool;

import java.util.Scanner;

public class SMSMessage {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		  
		  
		    //Sender:<Mike Smith>. From Number:[202-123-3456].
		    //Message:{I love programing and problem solving}
		    
		    sender = message.substring(message.indexOf("<")+1,
		    message.indexOf(">"));
		    System.out.println("Sender: "+ sender);
		    
		    phoneNumber= message.substring(message.indexOf("[")+1,
			message.indexOf("]"));		    
		    System.out.println("phoneNumber: "+phoneNumber); 
		   
		    messageBody = message.substring(message.indexOf("{")+1,
			message.indexOf("}"));
		    System.out.println("messageBody: "+ messageBody);
	}

}
