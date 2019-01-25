package us3;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Precondition{
	static WebDriver driver;
	static WebElement login, password, signUp, req_but, page, inc_con;
	public static int linksCount = 0;
	public static String[] links = null; 

	
	public static void setup_enviroment() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sotsos:St.Petersburg@insoor.com");
	}

	public static void autoriz() throws InterruptedException {
		login = driver.findElement(By.id("loginform-email"));
		password = driver.findElement(By.id("loginform-password"));
		login.sendKeys("Anzhela.Barkovskaia@sotsos.com");
		password.sendKeys("tosca!123");
		signUp = driver.findElement(By.name("login-button"));
		signUp.submit();
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[2]/a/span")));
	}

	// список меню
	public static void main_sidebar() throws Exception {
		List<WebElement> linksize = driver.findElements(By.tagName("a"));
		linksCount = linksize.size();
		links = new String[linksCount];
		for (int i = 0; i < linksCount; i++) {
			links[i] = linksize.get(i).getAttribute("href");
		}
	}

	public void tearDown() {
		driver.quit();
	}

}
