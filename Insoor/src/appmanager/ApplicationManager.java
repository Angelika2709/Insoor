package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import models.OfferData;

public class ApplicationManager {
	WebDriver wd;

	private SessionHelper sessionHelper;
	private NavigationHelper navigationHelper;
	private OfferData offerData;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("http://sotsos:St.Petersburg@insoor.com");
		sessionHelper = new SessionHelper(wd); // new obj init for using in Helper
		sessionHelper.login("Anzhela.Barkovskaia@sotsos.com", "tosca!123");
		navigationHelper = new NavigationHelper(wd); // new obj init for using in Helper		
		
	}

	public void stop() {
		System.out.println("Running: tearDown");
		wd.quit();
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}
	
    public OfferData getOfferData() {
        return offerData;
    }

}
