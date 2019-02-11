package appmanager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InsuranceType <WebElement> extends HelperBase{
	private NavigationHelper navigationHelper;		
	private final String [] types;	
	
public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}	

	public void get_ins_types() {
		By locator = By.xpath("//*[@id=\"userinsurancetypecompany-insurance_type_id\"]");
		ArrayList<WebElement> ins_types = (ArrayList<WebElement>) wd.findElements(locator);
		for (int j = 0; j < ins_types.size(); j++) {
			types[j] = ins_types.get(j).toString();
			System.out.println(types[j]);
			return types;
		}	
		


		
	}

			
}
