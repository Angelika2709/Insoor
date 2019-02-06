package us1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Precondition_policy {
	public static WebDriver driver;
	public static WebElement login, password, signUp, req_but, page, inc_con, signout_but;
	public static int linksCount = 0;
	public static String[] links = null;

	public static void setup_enviroment() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sotsos:St.Petersburg@insoor.com");
	}

	public static void autoriz() {
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
	public static void main_sidebar(){
		List<WebElement> linksize = driver.findElements(By.tagName("a"));
		linksCount = linksize.size();
		links = new String[linksCount];
		for (int i = 0; i < linksCount; i++) {
			links[i] = linksize.get(i).getAttribute("href");			
		}
		Precondition_policy.driver.navigate().to(Precondition_policy.links[25]);		
	}
	
	// разлогиниться
	public static void sign_out() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement sign_out_but = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='fa fa-sign-out']")));
		sign_out_but.sendKeys(Keys.ENTER);
	}
}
