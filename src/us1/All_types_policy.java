package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import us3.Precondition_req_new;
import us4.Precondition;

class All_types_policy {
	private Precondition_policy pr;
	private Upload_policy_controls upl_contr = new Upload_policy_controls();
	

	@BeforeEach
	void setUp() throws Exception  {
		pr = new Precondition_policy();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_policy.main_sidebar();
	}

	@Test
	void test() {
		Precondition_policy.driver.navigate().to(Precondition_policy.links[28]);
		Precondition_policy.driver.findElement(By.id("new_policy")).click();
		
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(Precondition_policy.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("policy-form-container")));
		
		upl_contr.get_ins_types();
		/*->*/ upl_contr.field_ins_types_pol.sendKeys(Upload_policy_controls.pol_types[0]);
				
		upl_contr.get_insur();
		/*->*/ upl_contr.field_insur.sendKeys(Upload_policy_controls.insurers_pol[2]);
				
		upl_contr.get_data();
		/*->*/ upl_contr.beg_per.sendKeys(Upload_policy_controls.date_values[1]);
		upl_contr.end_per.sendKeys(Upload_policy_controls.date_values[2]);
		
		upl_contr.get_price();
		/*->*/ upl_contr.field_price.sendKeys(Upload_policy_controls.price_values[0]);
		
		upl_contr.submit_pol();
		
		WebDriverWait wait1 = new WebDriverWait(pr.driver, 10);
		WebElement error = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='form-policy-add']/div/div[2]/div/p")));
		Assert.assertEquals(error.getText(), "Insurance Type ID cannot be blank.");
		System.out.println(error.getText());	
		
		upl_contr.close_pol();		
		pr.sign_out();
	}

	@AfterEach
	void tearDown() throws Exception {	
		System.out.println("Running: tearDown");
		this.pr=null;
		this.upl_contr=null;
		pr.driver.close();
	}

}
