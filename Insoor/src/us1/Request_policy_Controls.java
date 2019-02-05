package us1;

import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


public class Request_policy_Controls extends Precondition_req_policy {
	
		public static String[] statuses, types;
		public WebElement field_insur, field_ins_types, field_price, beg_per, end_per;
		public static String [] date_values = {"dd/MM/yyyy", "24/01/2019", "24/04/2019", "24/07/2019", "24/01/2020"};
		public static String [] price_values = {"101", "-101", "0"};
		
		//Insurance type
		public void get_ins_types() {
			Select dropdown_ins_types = new Select(driver.findElement(By.id("userinsurancetypecompany-insurance_type_id")));
			List<WebElement> dd_ins_types = dropdown_ins_types.getOptions();
			types = new String[linksCount];
			for (int j = 0; j < dd_ins_types.size(); j++) {
				types[j] = dd_ins_types.get(j).getText();
			}
			field_ins_types = driver.findElement(By.id("userinsurancetypecompany-insurance_type_id"));
		}
		
		
		//Insurer
		public void get_insur() {
			Select dropdown_insur = new Select(driver.findElement(By.id("userinsurancetypecompany-company_id")));
			List<WebElement> dd_insur = dropdown_insur.getOptions();
			statuses = new String[linksCount];
			for (int j = 0; j < dd_insur.size(); j++) {
				statuses[j] = dd_insur.get(j).getText();
			}
			field_insur = driver.findElement(By.id("userinsurancetypecompany-company_id"));
		}
		
		//Begin and end
		public void get_data() {
			beg_per = driver.findElement(By.id("start_datepicker"));
			end_per = driver.findElement(By.id("end_datepicker"));
		}
		
		//Price per Year
		public void get_price() {
			field_price = driver.findElement(By.id("userinsurancetypecompany-price_year"));
		}
		
		public void submit_req() {	
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]")).sendKeys(Keys.ENTER);		
		}
		
		public void close_req() {
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[1]")).sendKeys(Keys.ENTER);
		}	

}
