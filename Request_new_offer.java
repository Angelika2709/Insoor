package us3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Request_new_offer extends Precondition {
	public static String[] statuses, types, per;
	public WebElement field_mar_st, field_ins_types, field_pay_per, male, female, transgender, beg_per, end_per,
			smoke_yes, smoke_no;
	public static String [] date_values = {"dd/MM/yyyy", "24/01/2019", "24/04/2019", "24/07/2019", "24/01/2020"};
	
	public void get_mar_st() {
		Select dropdown_mar_st = new Select(driver.findElement(By.xpath("//*[@id=\"customer-maritalstatus\"]")));
		List<WebElement> dd_mar_st = dropdown_mar_st.getOptions();
		statuses = new String[linksCount];
		for (int j = 0; j < dd_mar_st.size(); j++) {
			statuses[j] = dd_mar_st.get(j).getText();
		}
		field_mar_st = driver.findElement(By.id("customer-maritalstatus"));
	}

	protected void get_data() {
		beg_per = driver.findElement(By.id("start_datepicker"));
		end_per = driver.findElement(By.id("end_datepicker"));
	}
		

	protected void get_smoke() {
		smoke_yes = driver.findElement(By.id("Customer[smoker]0"));
		smoke_no = driver.findElement(By.id("Customer[smoker]1"));
	}

	protected void get_ins_types() {
		Select dropdown_ins_types = new Select(driver.findElement(
				By.xpath("//*/form/div/div[4]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]")));
		List<WebElement> dd_ins_types = dropdown_ins_types.getOptions();
		types = new String[linksCount];
		for (int j = 0; j < dd_ins_types.size(); j++) {
			types[j] = dd_ins_types.get(j).getText();
		}
		field_ins_types = driver.findElement(
				By.xpath("//*/form/div/div[4]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
	}

	protected void get_pay_per() {
		Select dropdown_pay_per = new Select(
				driver.findElement(By.xpath("//*[@id=\"userinsurancetypecompany-payment_period_type\"]")));
		List<WebElement> dd_pay_per = dropdown_pay_per.getOptions();
		per = new String[linksCount];
		for (int l = 0; l < dd_pay_per.size(); l++) {
			per[l] = dd_pay_per.get(l).getText();
		}
		field_pay_per = driver.findElement(By.id("userinsurancetypecompany-payment_period_type"));
	}

	public void get_gender() {
		male = driver.findElement(By.id("Customer[gender]0"));
		female = driver.findElement(By.id("Customer[gender]1"));
		transgender = driver.findElement(By.id("Customer[gender]2"));
	}
	
	public void submit_req() {	
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]")).sendKeys(Keys.ENTER);		
	}
	
	public void close_req() {
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[1]")).sendKeys(Keys.ENTER);
	}
	
	public static void main(String[] args) throws Exception {
		setup_enviroment();
		autoriz();
		main_sidebar();
		driver.navigate().to(links[28]);
		driver.findElement(By.id("new_offer")).click();
		
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));
		Request_TestCases req = new Request_TestCases();
		// #1 : req.req_new_Straight_Through();
		// #2 : req.req_new_Mar_st_empty();
		// #3 :	req_new_Pay_per_Empty();
		// #4 : req_new_Beg_per_Empty();
		req.req_new_End_per_Empty();
		driver.navigate().to(links[25]);
		driver.close();
	}

}
