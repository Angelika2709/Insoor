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
	List<String> ins_types = new ArrayList<>();
	public WebElement field_ins_types;

	public InsuranceType(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);

	}

	public List<String> getListTypes() {
		WebElement types_list = wd
				.findElement(By.xpath("//select[@id=\"userinsurancetypecompany-insurance_type_id\"]"));
		List<WebElement> alltypes = types_list.findElements(By.tagName("option"));
		for (int j = 0; j < alltypes.size(); j++) {
			ins_types.add(alltypes.get(j).getText());
		}
		return ins_types;
	}

	public void getTypes(InsTypes insttypes) {
		sendValues(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"),
				insttypes.returnInstTypes());

	}

}
