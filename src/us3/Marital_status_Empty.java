package us3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import us4.Precondition;

class Marital_status_Empty {
	Precondition_req_new pr;
	Request_new_Controls req_contr = new Request_new_Controls();

	@BeforeEach
	void setUp() throws Exception {
		pr = new Precondition_req_new();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_req_new.main_sidebar();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr=null;
		this.req_contr=null;
		pr.driver.close();
	}

	@Test
	void test() {
		Precondition_req_new.driver.navigate().to(Precondition_req_new.links[28]);
		Precondition_req_new.driver.findElement(By.id("new_offer")).click();

		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(Precondition_req_new.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));
		
		
		req_contr.get_gender();
		/*->*/ req_contr.male.isSelected();
		req_contr.get_smoke();
		/*->*/ req_contr.smoke_no.isSelected();
		req_contr.get_mar_st();
		/*->*/ req_contr.field_mar_st.sendKeys(Request_new_Controls.statuses[0]);
		req_contr.get_ins_types();
		/*->*/ req_contr.field_ins_types.sendKeys(Request_new_Controls.types[1]);
		req_contr.get_data();
		/*->*/ req_contr.beg_per.sendKeys(Request_new_Controls.date_values[1]);
		req_contr.end_per.sendKeys(Request_new_Controls.date_values[2]);
		req_contr.get_pay_per();
		/*->*/ req_contr.field_pay_per.sendKeys(Request_new_Controls.per[2]);
		req_contr.submit_req();
		
		WebDriverWait wait1 = new WebDriverWait(Precondition_req_new.driver, 10);
		WebElement error = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='form-offer-add']/div/div[3]/div/p")));
		Assert.assertEquals(error.getText(), "Marital Status cannot be blank.");
		System.out.println(error.getText());
		
		req_contr.close_req();
		pr.sign_out();
	}

}
