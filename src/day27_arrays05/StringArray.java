package day27_arrays05;

public class StringArray {

	public static void main(String[] args) {
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project
		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

		for (String tool : tools) {
			
			switch (tool.toLowerCase()) {
			case "java":
				System.out.println("programming language");
				break;
			case "Selenium":
				System.out.println("Test Automation");
				break;
			case "TestNG":
				System.out.println("Unit Tests");
				break;
			case "JUnit":
				System.out.println("BDD Style testing");
				break;
			case "Cucumber":
				System.out.println("Version control");
				break;
			case "Maven":
				System.out.println("Building and execution for project");
				break;
			default:
				System.out.println("Incorrect program");

			}

		}

	}

}
