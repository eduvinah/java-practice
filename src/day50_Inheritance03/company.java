package day50_Inheritance03;

public class company {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee  emp1 = new FullTimeEmployee();
		Contractor emp2 = new Contractor();
			emp.calculatePay(40, 40);
			emp1.calculatePay(40,45);
			emp2.calculatePay(40, 55);
		}
	}


