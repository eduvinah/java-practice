package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
     String sentence ="I wrote [236] lines of code today";
     int start = sentence.indexOf('[')+1;
     int end = sentence.indexOf(']');
     String codeCount= sentence.substring(start,end);
    	 System.out.println("Lines of code: "+codeCount);
    	 
    	 System.out.println("Lines of code: "+sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
	    // check if codeCount is more than 20;
    	 int count= Integer.parseInt(codeCount);// convert Strin gto int
    	 if (count>20) {
    	 System.out.println("wrote more than 20 lines of code today");
	}else {
		System.out.println("Not enough coding for today");
		
	}

	}

	}
