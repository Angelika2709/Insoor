package appmanager;





import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public void verificationType() {
		String typeError = wd.findElement(By.xpath("//*[@id=\"form-policy-add\"]/div[1]/div[2]/div/p")).getText();
		WebElement types = wd
				.findElement(By.xpath("//select[@id='userinsurancetypecompany-insurance_type_id']/option[1]"));
		if (types != null) 
			Assert.assertTrue(typeError, true);			
			System.out.println(typeError.toString());		
	}
}
