package appmanager;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appmanager.*;
import model.InsTypes;

public class InsuranceType extends HelperBase {
	private NavigationHelper navigationHelper;
	WebDriverWait wait = new WebDriverWait(wd, 10);
	public WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='form-policy-add']/div/div[2]/div/p")));

	public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public void getTypes(InsTypes insttypes) {
		sendValues(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"),
				insttypes.returnInstTypes());
		
	}
}

