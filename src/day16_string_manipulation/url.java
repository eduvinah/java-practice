package day16_string_manipulation;
import java.util.*;
public class url {

	public static void main(String[] args) {
		//-check that it starts with www.
		//-check it contains the ending dot right before the extension
		//-assing String  domain name (amazon) and extension String extension. 
		//- print them 
		//"Domain is:"amazon 
		//"Extension:" com.
		Scanner scan= new Scanner (System.in);
		System.out.println("enter url");
		String url= scan.next();
			
		if (url.startsWith("www.")) {
			System.out.println("websites starts with www.");
		}else {
			System.out.println("Invalid format");
			return;
			//www.etsy.com==>12;
		}
			int dotIndex = url.length()-4;
			
			if(url.charAt(dotIndex)=='.') {
			System.out.println(". is present");
			
			}else {
				System.out.println(". might be misplace");
			}
				/*
				 * if (url.charAt(url.length()-4)=='.'){
				 }
				 */
				String domain = url.substring(4,dotIndex);
				//String extension = 
				System.out.println("Domain: " +domain);
				String extension=url.substring(dotIndex+1, url.length());
				System.out.println("Extension: " +extension);
			}
			
		}

	
