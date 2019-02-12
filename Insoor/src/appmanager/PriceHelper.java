
package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceHelper extends HelperBase {

	public PriceHelper(WebDriver wd) {
		super(wd);
	}

	public void price(String price) {
		type(By.id("userinsurancetypecompany-price_year"), price);	

	}
}
