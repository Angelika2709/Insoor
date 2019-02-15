package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ApplicationManager {
	WebDriver wd;

	private SessionHelper sessionHelper;
	private NavigationHelper navigationHelper;
	private InsuranceType insuranceType;
	private Insurer insurerName;
	public DatesHelper datesHelper;
	public PriceHelper priceHelper;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://sotsos:St.Petersburg@insoor.com");		
		sessionHelper = new SessionHelper(wd);
		datesHelper = new DatesHelper(wd); 
		priceHelper = new PriceHelper(wd); 
		sessionHelper.login("Anzhela.Barkovskaia@sotsos.com", "tosca!123");
		navigationHelper = new NavigationHelper(wd); 	
		insuranceType = new InsuranceType(wd);
		insurerName = new Insurer(wd);
	}

	public void stop() {
		System.out.println("Running: tearDown");
		wd.quit();
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}
	
    public InsuranceType getInsuranceType() {
        return insuranceType;
    }
    
    public Insurer getInsurerName() {
        return insurerName;
    }
    
    
   }
