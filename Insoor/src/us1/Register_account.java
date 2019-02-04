package us1;

import org.junit.jupiter.api.AfterEach;

public class Register_account extends Reg_instances{

	public static void main(String[] args) throws Exception {		
		Precondition set = new Precondition();
		set.setUp();
		Reg_instances reg = new Reg_instances();
		/* 1 *///reg.StraightThrough();
		/* 2 */reg.Invalid_Email();	
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
