package appmanager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import appmanager.*;

public class InsuranceType extends HelperBase {
	private NavigationHelper navigationHelper;
	public WebElement field_ins_types;
	List<String> ins_types = new ArrayList<String>();

	public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public List<String> types() {
		WebElement types_list = wd
				.findElement(By.xpath("//select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
		List<WebElement> alltypes = types_list.findElements(By.tagName("option"));
		for (int j = 0; j < alltypes.size(); j++) {
			ins_types.add(alltypes.get(j).getText());	
			System.out.println(alltypes.get(j).getText());
		}
		return ins_types;
		
	}

	public void setInstTypes() {		
		field_ins_types = wd.findElement(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
		field_ins_types.sendKeys(ins_types.get(2));
	}

}
