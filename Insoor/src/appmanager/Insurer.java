package appmanager;

import java.util.ArrayList;
import java.util.List;
import appmanager.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Insurer extends HelperBase {
	private NavigationHelper navigationHelper;
	public WebElement field_insurer;
	List<String> insurer = new ArrayList<String>();

	public Insurer(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}

	public List<String> insurer() {
		WebElement types_list = wd
				.findElement(By.xpath("//*[@id=\"userinsurancetypecompany-company_id\"]"));
		List<WebElement> allinsurers = types_list.findElements(By.tagName("option"));
		for (int j = 0; j < allinsurers.size(); j++) {
			insurer.add(allinsurers.get(j).getText());	
			System.out.println("ok");
		}
		return insurer;		
	}
	
	public void setInsurers() {	
		field_insurer = wd.findElement(By.xpath("//*/form/div/div[3]/div/select[@id=\"userinsurancetypecompany-company_id\"]"));
		field_insurer.sendKeys("PAX");
	}

}
