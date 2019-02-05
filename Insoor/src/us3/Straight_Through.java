package us3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import us4.Precondition;

class Straight_Through {
	private Precondition pr;

	@BeforeEach
	void setUp() {
		pr = new Precondition();		
		pr.setup_enviroment();
		pr.
	}


	@Test
	void test() {		
		autoriz();
		main_sidebar();
		driver.navigate().to(links[28]);
		driver.findElement(By.id("new_offer")).click();
		
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));
		Request_TestCases req = new Request_TestCases();
		
		
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[1]);
		get_data(); /*->*/ beg_per.sendKeys(date_values[1]); end_per.sendKeys(date_values[2]);
		get_pay_per(); /*->*/ field_pay_per.sendKeys(per[2]);
		submit_req();
		close_req();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.navigate().to(links[25]);
		Precondition.driver.quit();
	}

}
