package day10_LogicalOperators_conditonals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isBreakTime = true;
		if(isBreakTime ==true) {
			System.out.println("Break till 8:45 PM");
		}else{
			System.out.println("Not Break time yet.");
		}
		//2nd version. Boolean variable does not need == true because it already contain true/false.
	
		if(isBreakTime==false) {
			System.out.println("Break till 8:45 PM");
		}else{
			System.out.println("Not Break time yet.");
			
			boolean classTime = true;
			if(classTime) {
				System.out.println("Come back on time");
				System.out.println("Stop talking");
				System.out.println("Pay Attention");
				System.out.println("Code and have fun!");
			}else {
				System.out.println("Take a walk and have some water.");
			}
			boolean qualified =false;
			if(qualified==false)
			System.out.println(" Your aplication was not approve.Thank you");
			}
}
}
