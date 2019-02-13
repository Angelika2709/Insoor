
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

	public void verificationDates() {
		String beginError = wd.findElement(By.xpath("//*[@id=\"form-policy-add\"]/div[1]/div[4]/div/p")).getText();
		String endError = wd.findElement(By.xpath("//*[@id=\"form-policy-add\"]/div[1]/div[5]/div/p")).getText();
		WebElement begin = wd.findElement(By.xpath("//input[@id='start_datepicker']"));
		WebElement end = wd.findElement(By.xpath("//input[@id='end_datepicker']"));

		if (begin != null)
			Assert.assertTrue(beginError, true);
		System.out.println(beginError.toString());
		
		if (end != null)
			Assert.assertTrue(endError, true);
		System.out.println(endError.toString());
	}

}
