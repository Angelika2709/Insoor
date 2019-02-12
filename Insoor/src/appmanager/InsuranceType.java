package appmanager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appmanager.*;
import model.InsTypes;

public class InsuranceType extends HelperBase {
	private NavigationHelper navigationHelper;


	public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public void getTypes(InsTypes insttypes) {
		sendValues(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"),
				insttypes.returnInstTypes());
	}

}
