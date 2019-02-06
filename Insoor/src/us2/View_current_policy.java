package us2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;




class View_current_policy {
	private Precondition_policy_view pr;
	private Upload_policy_controls_view upl_policy = new Upload_policy_controls_view();

	@BeforeEach
	void setUp() throws Exception {
		pr = new Precondition_policy_view();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_policy_view.main_sidebar();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr=null;
		this.upl_policy=null;
		pr.driver.close();
	}

	@Test
	void test() {
		Precondition_policy_view.driver.navigate().to(Precondition_policy_view.links[28]);
		Precondition_policy_view.driver.findElement(By.id("new_policy")).click();		
		
		upl_policy.get_ins_types(); upl_policy.field_ins_types.sendKeys("Life");
		upl_policy.get_insur(); upl_policy.field_insur.sendKeys("Pax");
		upl_policy.get_data(); upl_policy.beg_per.sendKeys("24/01/2019");
		upl_policy.end_per.sendKeys("24/02/2019");
		upl_policy.get_price(); upl_policy.field_price.sendKeys("101");
		
		upl_policy.submit_req();
		upl_policy.close_req();		
		pr.sign_out();
	}

}
