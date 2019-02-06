package us2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Upload_policy_controls_view extends Precondition_policy_view {

	public WebElement field_insur, field_ins_types, field_price, beg_per, end_per;
	

	// Insurance type
	public void get_ins_types() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		field_ins_types = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("userinsurancetypecompany-insurance_type_id")));
	}

	// Insurer
	public void get_insur() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		field_insur = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("userinsurancetypecompany-company_id")));
	}

	// Begin and end
	public void get_data() {
		beg_per = driver.findElement(By.id("start_datepicker"));
		end_per = driver.findElement(By.id("end_datepicker"));
	}

	// Price per Year
	public void get_price() {
		field_price = driver.findElement(By.id("userinsurancetypecompany-price_year"));
	}

	public void submit_req() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]"))
				.sendKeys(Keys.ENTER);
	}

	public void close_req() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[1]"))
				.sendKeys(Keys.ENTER);
	}

}
