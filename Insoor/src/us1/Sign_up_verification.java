package us1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sign_up_verification extends Sign_up {
	WebElement code, ver_but, req_but;

	public void getSignUpVerif() {
		code = driver.findElement(By.id("signupverifyform-verificationcode"));
		ver_but = driver.findElement(By.name("verify-button"));
		req_but = driver.findElement(By.name("request-button"));
	}
}
