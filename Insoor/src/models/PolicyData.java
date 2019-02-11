package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appmanager.HelperBase;
import appmanager.NavigationHelper;

public class PolicyData extends HelperBase{
	private NavigationHelper navigationHelper;		
		
	
public PolicyData(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}	
	
	public void get_controls() {
		WebElement ins_types = wd.findElement(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
			
	}
	

}
