package us2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import us3.Precondition_req_new;

class Verify_current_policy {
	private Precondition_policy_view pr;
			
	@BeforeEach
	void setUp() throws Exception {
		pr = new Precondition_policy_view();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_policy_view.main_sidebar();
	}
	
	@Test
	void test() {
		Precondition_policy_view.driver.navigate().to(Precondition_policy_view.links[28]);
		Precondition_policy_view.driver.findElement(By.id("new_policy")).click();	
		
		Upload_policy_controls upl_policy = new Upload_policy_controls("Life", "PAX", "24/01/2019", "24/02/2019");
			
		upl_policy.field_ins_types.sendKeys(upl_policy.type);
		upl_policy.field_insur.sendKeys(upl_policy.insur);
		upl_policy.beg_per.sendKeys(upl_policy.begin);
		upl_policy.end_per.sendKeys(upl_policy.end);
		
			
		upl_policy.submit_upl();
		upl_policy.close_upl();				
		upl_policy.view_card();
		
		//System.out.println(upl_policy.value1 = upl_policy.type);		
		pr.sign_out();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr=null;
		pr.driver.close();
	}

}
