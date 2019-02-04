package us1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Personal_data extends Sign_up_verification{
	public WebElement first_name, last_name, address, post_code, city, birthday, conf_but;
	
	public void getPersonalData() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("w3-success-0")));
		
		first_name = driver.findElement(By.id("personaldataform-firstname"));
		last_name = driver.findElement(By.id("personaldataform-lastname"));
		address = driver.findElement(By.id("personaldataform-address"));
		post_code = driver.findElement(By.id("personaldataform-postcode"));
		city = driver.findElement(By.id("personaldataform-city"));
		birthday = driver.findElement(By.id("datepicker"));
		conf_but = driver.findElement(By.xpath("//*[@name='confirm-button'"));		
	}	

}
