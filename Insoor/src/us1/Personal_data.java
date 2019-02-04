package us1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Personal_data extends Sign_up_verification{
	WebElement first_name, last_name, address, post_code, city, birthday, conf_but;
	
	public void getPersonalData() {
		first_name = driver.findElement(By.id("personaldataform-firstname"));
		last_name = driver.findElement(By.id("personaldataform-lastname"));
		address = driver.findElement(By.id("personaldataform-address"));
		post_code = driver.findElement(By.id("personaldataform-postcode"));
		city = driver.findElement(By.id("personaldataform-city"));
		birthday = driver.findElement(By.id("datepicker"));
		conf_but = driver.findElement(By.xpath("//*[@name='confirm-button'"));		
	}	

}
