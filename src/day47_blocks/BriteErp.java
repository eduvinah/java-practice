package day47_blocks;

import java.time.LocalDateTime;
import static day47_blocks.BriteErp.*;
import static day47_blocks.testData.*;

public class BriteErp {

	static {// automatically runs
		System.out.println("Launch browser");
		System.out.println("Navitage to " + testData.url);

	}

	public static void enterEmail() {
		System.out.println("Enter email" + testData.email);
	}

	public static void enterpassword() {
		System.out.println("Enter email" + testData.password);
	}

	public static void verifyLogin() {
		System.out.println("Expect name:" + testData.userName);
		System.out.println("Actual name displaed: Viktoriia Lugovska");
		System.out.println("Login successfully - " + LocalDateTime.now());
	
	
	}
}
