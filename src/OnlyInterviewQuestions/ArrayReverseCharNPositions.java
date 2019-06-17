package OnlyInterviewQuestions;
import java.util.Arrays;
public class ArrayReverseCharNPositions {

	
	public static void main(String[] args) {
	    String[] name = {"burak ucal","ghf"};
	    
	    String[] arr = new String[name.length];
	    
	    for(int i=0;i<name.length;i++) {
	        arr[i]=name[name.length - 1-i];
	        
	        
	    }
	    String str= "";
	    for(int i=0;i<arr.length;i++) {
	        for(int j=arr[i].length()-1;j>=0;j--) {
	            str = str + arr[i].charAt(j);
	            
	        }
	        arr[i]=str;
	        str="";
	    }
	    System.out.println(Arrays.toString(arr));
	}
	}

