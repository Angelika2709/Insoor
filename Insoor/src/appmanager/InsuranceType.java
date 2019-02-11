package appmanager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import models.PolicyData;
import appmanager.*;

public class InsuranceType extends HelperBase {
	private NavigationHelper navigationHelper;
	public WebElement field_ins_types;

	public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public void fillInstTypes(PolicyData[] types) {
		sendInstTypes();
		getInsTypes(types);
		
	}

	public void getInsTypes(PolicyData[] types) {
		WebElement types_list = wd.findElement(
				By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
		List<WebElement> ins_types = (List<WebElement>) types_list.findElement(By.xpath(".//option"));
		int k = 0;
		for (WebElement opt : ins_types) {
			types[k] = (PolicyData) ins_types.get(k);
			System.out.println(types[k]);
		}
	}

	public void sendInstTypes() {
		field_ins_types = wd.findElement(
				By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
	}

}
