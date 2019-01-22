package us3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Request_new_offer extends Precondition {
	public static String[] statuses, types, per;
	String dates = null;
	WebElement req_but, field_mar_st, field_ins_types, field_pay_per, male, female, transgender, beg_per, end_per,
			submit, smoke_yes, smoke_no;

	public void req_new_Straight_Through() throws Exception {

		female.click();
		smoke_no.click();
		field_mar_st.sendKeys(statuses[3]);
		field_ins_types.sendKeys(types[2]);
		beg_per.sendKeys("date_values[0]");
		end_per.sendKeys("date_values[1]");
		field_pay_per.sendKeys(per[2]);
	}

	public void req_new() throws Exception {
		req_but = driver.findElement(By.id("new_offer"));
		req_but.click();

		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));

		get_gender();
		get_smoke();
		get_mar_st();
		get_pay_per();
		get_ins_types();
		get_data();
		Thread.sleep(5000);
		submit();
	}

	protected void get_data() {
		beg_per = driver.findElement(By.id("start_datepicker"));
		end_per = driver.findElement(By.id("end_datepicker"));
		for (int n = 0; n < date_values.length; n++) {
			dates = date_values[n];
		}
	}

	protected void submit() {
		submit = driver.findElement(By.xpath(
				"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]"));
		submit.click();
	}

	protected void get_mar_st() {
		Select dropdown_mar_st = new Select(driver.findElement(By.xpath("//*[@id=\"customer-maritalstatus\"]")));
		List<WebElement> dd_mar_st = dropdown_mar_st.getOptions();
		statuses = new String[linksCount];
		for (int j = 0; j < dd_mar_st.size(); j++) {
			statuses[j] = dd_mar_st.get(j).getText();
		}
		field_mar_st = driver.findElement(By.id("customer-maritalstatus"));
	}

	protected void get_smoke() {
		smoke_yes = driver.findElement(By.xpath("//label[@for='Customer[smoker]0']"));
		smoke_no = driver.findElement(By.xpath("//label[@for='Customer[smoker]1']"));
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

	protected void get_gender() {
		male = driver.findElement(By.xpath("//label[@for='Customer[gender]0']"));
		female = driver.findElement(By.xpath("//label[@for='Customer[gender]1']"));
		transgender = driver.findElement(By.xpath("//label[@for='Customer[gender]2']"));
	}

	public static void main(String[] args) throws Exception {
		Request_new_offer req = new Request_new_offer();
		req.setup_enviroment();
		req.autoriz();
		req.main_sidebar();
		driver.navigate().to(links[28]);
		req.req_new();
		req.req_new_Straight_Through();

	}

}
