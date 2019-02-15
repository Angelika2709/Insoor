
package appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceHelper extends HelperBase {

	public PriceHelper(WebDriver wd) {
		super(wd);
	}

	public void price(String price) {
		type(By.id("userinsurancetypecompany-price_year"), price);	
	}
	
	public void verificationPrice() {
		String priceError = wd.findElement(By.xpath("//*[@id=\"form-policy-add\"]/div[1]/div[6]/div/p")).getText();
		WebElement price = wd.findElement(By.xpath("//input[@id='userinsurancetypecompany-price_year']"));
		
		if (price != null)
			Assert.assertTrue(priceError, true);
		System.out.println(priceError.toString());
		
	}
}
