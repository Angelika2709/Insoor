package appmanager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import models.OfferData;

public class OfferHelper extends HelperBase {
	private NavigationHelper navigationHelper;
	public static String[] insurers_pol, pol_types;
	private static int linksCount = 0;
	private static String[] links = null;
	private String[] date_values = { "dd/MM/yyyy", "24/01/2019", "24/04/2019", "24/07/2019", "24/01/2020" };
	private String[] price_values = { "101", "-101", "0" };


	public OfferHelper(WebDriver wd) {
		super(wd);
		navigationHelper = new NavigationHelper(wd);
	}
	
	public void fillOfferData(OfferData offerData) {
		type(By.xpath("//*/form/div/div[2]/div/select[@id=\"userinsurancetypecompany-insurance_type_id\"]"), offerData.get_ins_type());
        type(By.xpath("//*/form/div/div[3]/div/select[@id=\"userinsurancetypecompany-company_id\"]"), offerData.get_insur());
        type(By.id("start_datepicker"), offerData.get_data_begin());
        type(By.id("end_datepicker"), offerData.get_data_end());
        type(By.id("userinsurancetypecompany-price_year"), offerData.get_price());
	}
	
	// Insurance type
		public void get_ins_types() {
			Select dropdown_ins_types = new Select(
					wd.findElement(By.xpath("//*[@id=\"userinsurancetypecompany-insurance_type_id\"]")));
			List<WebElement> dd_ins_types = dropdown_ins_types.getOptions();
			pol_types = new String[linksCount];
			for (int j = 0; j < dd_ins_types.size(); j++) {
				pol_types[j] = dd_ins_types.get(j).getText();
			}
		}

		// Insurer
		public void get_insur() {
			Select dropdown_insur = new Select(
					wd.findElement(By.xpath("//*[@id=\"userinsurancetypecompany-company_id\"]")));
			List<WebElement> dd_insur = dropdown_insur.getOptions();
			insurers_pol = new String[linksCount];
			for (int o = 0; o < dd_insur.size(); o++) {
				insurers_pol[o] = dd_insur.get(o).getText();
			}
		}

		public void submit_pol() {
			wd.findElement(By.xpath(
					"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]"))
					.submit();
		}

		public void close_pol() {
			wd.findElement(By.xpath(
					"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[1]"))
					.sendKeys(Keys.ENTER);
		}
}