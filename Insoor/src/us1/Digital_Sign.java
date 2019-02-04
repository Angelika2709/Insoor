package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Digital_Sign extends Personal_data {
	public WebElement canvas, fin_but;

	@Test
	public void getDig_Sign() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		canvas = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='jSignature sign__jSignature']")));
		fin_but = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='regfin-button']")));

	}

}
