package us4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Personal_data extends Sign_up_verification{
	public WebElement first_name, last_name, address, post_code, city, birthday, conf_but;

	public void getPersonalData() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		first_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='personaldataform-firstname']")));
		last_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personaldataform-lastname")));
		address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personaldataform-address")));
		post_code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personaldataform-postcode")));
		city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personaldataform-city")));
		birthday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		conf_but = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='confirm-button']")));

	}
}
