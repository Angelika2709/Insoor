package us1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class Precondition {
	static WebDriver driver;


	public static void setup_enviroment() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sotsos:St.Petersburg@insoor.com/en/signup?testKey=testme");
	}

	public void tearDown() {
		driver.quit();
	}
}
