
package appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatesHelper extends HelperBase {

	public DatesHelper(WebDriver wd) {
		super(wd);
	}

	public void data(String begin, String end) {
		type(By.id("start_datepicker"), begin);
		type(By.id("end_datepicker"), end);
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
