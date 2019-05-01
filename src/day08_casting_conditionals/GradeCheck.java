package day08_casting_conditionals;
import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		/* A,B,C,D
	   char grade = scan.next().charAt(0);
		if grade is 'A'  => 
         excellent job! keep it up1
         else
         how many points did you miss fr 'A'?
         int points = scanner
         print "You grade B is not good enough."
         "You could earn 10 more points if you studied harder.     
         */
	   
        Scanner keyboard = new Scanner (System.in);
      System.out.println("What is our grade?");
		char grade = keyboard.next().toUpperCase().charAt(0);
      if(grade >= 'A') {
    	  System.out.println("excellent job! keep it up");
      }else {
    	  System.out.println("How many points did you miss for'A'?");
    	  int points = keyboard.nextInt();
    	  

      }
    		 
        }
         
	}


