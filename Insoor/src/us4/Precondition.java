package us4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Precondition {
	public static WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sotsos:St.Petersburg@insoor.com/en/signup?testKey=testme");
	}
}
