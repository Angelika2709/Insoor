package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import us4.Precondition;

class Straight_Through_policy {
	private Precondition_req_policy pr;
	private Request_policy_Controls req_contr = new Request_policy_Controls();

	@BeforeEach
	void setUp() throws Exception  {
		pr = new Precondition_req_policy();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_req_policy.main_sidebar();
	}

	@Test
	void test() {
		Precondition_req_policy.driver.navigate().to(Precondition_req_policy.links[28]);
		Precondition_req_policy.driver.findElement(By.id("new_policy")).click();

		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(Precondition_req_policy.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));
		
		req_contr.get_ins_types();
		/*->*/ req_contr.field_insur.sendKeys(Request_policy_Controls.types[1]);
		
		req_contr.get_insur();
		/*->*/ req_contr.field_insur.sendKeys(Request_policy_Controls.statuses[1]);
		
		req_contr.get_data();
		/*->*/ req_contr.beg_per.sendKeys(Request_policy_Controls.date_values[1]);
		req_contr.end_per.sendKeys(Request_policy_Controls.date_values[2]);
		
		req_contr.get_price();
		/*->*/ req_contr.field_price.sendKeys(Request_policy_Controls.price_values[0]);
		
		req_contr.submit_req();
		req_contr.close_req();		
		pr.sign_out();
	}

	@AfterEach
	void tearDown() throws Exception {	
		System.out.println("Running: tearDown");
		this.pr=null;
		this.req_contr=null;
		pr.driver.close();
	}

}
