package appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import appmanager.*;
import model.InsNames;

public class Insurer extends HelperBase {
	private NavigationHelper navigationHelper;
	
	public Insurer(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public void getInsurer(InsNames insnames) {
		sendValues(By.xpath("//*/form/div/div[3]/div/select[@id=\"userinsurancetypecompany-company_id\"]"),
				insnames.returnInsurers());
	}

}
