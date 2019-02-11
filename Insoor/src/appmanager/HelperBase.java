package appmanager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {

	protected static WebDriver wd;


	public HelperBase(WebDriver wd) {
		this.wd = wd;
	}

	protected void type(By locator, String text) {
		wd.findElement(locator).sendKeys(text);
		wd.findElement(locator).click();
	}

	protected void click(By locator) {
		wd.findElement(By.name("login-button")).click();

		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[2]/a/span")));
	}

	

}
