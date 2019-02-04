package us1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_up_verification extends Sign_up {
	public WebElement code, ver_but, req_but;

	public void getSignUpVerif() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("w3-success-0")));
		
		code = driver.findElement(By.id("signupverifyform-verificationcode"));
		ver_but = driver.findElement(By.name("verify-button"));
		req_but = driver.findElement(By.name("request-button"));
	}
}
