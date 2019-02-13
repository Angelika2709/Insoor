package appmanager;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public void verificationInsurer() {
		String insError = wd.findElement(By.xpath("//*[@id=\"form-policy-add\"]/div[1]/div[3]/div/p")).getText();
		WebElement ins = wd
				.findElement(By.xpath("//select[@id='userinsurancetypecompany-company_id']/option[1]"));
		if (ins != null) 
			Assert.assertTrue(insError, true);			
			System.out.println(insError.toString());		
	}

}
