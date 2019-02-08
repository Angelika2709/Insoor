package us4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sign_up extends Precondition {
	public WebElement email, password, phonecode, phone, submit;

	public void getSignUp() {
		email = driver.findElement(By.id("signupform-email"));
		password = driver.findElement(By.id("signupform-password"));
		phonecode = driver.findElement(By.id("signupform-phonecode"));
		phone = driver.findElement(By.id("signupform-phone"));
		submit = driver.findElement(By.xpath("//*[@type='submit']"));
	}

}
