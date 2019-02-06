package us2;

import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.Keys;

public class Upload_policy_controls extends Precondition_policy_view {

	public WebElement field_insur, field_ins_types, field_price, beg_per, end_per;
	public String type, insur, begin, end;
	public static int cardsCount = 0;
	public static String[] cards = null;
	public String value1, value2, value3, value4;

	Upload_policy_controls(String type, String insur, String begin, String end) {	
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		field_ins_types = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userinsurancetypecompany-insurance_type_id']")));
		field_insur = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userinsurancetypecompany-company_id']")));
		beg_per = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_datepicker']")));
		end_per =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='end_datepicker']")));
		
		this.type = type;
		this.insur = insur;
		this.begin = begin;
		this.end = end;
		}

	public void submit_req() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[2]"))
				.sendKeys(Keys.ENTER);
	}

	public void close_req() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section[2]/section/div/div[1]/div/div[3]/div/div/div[2]/div/form/div[2]/button[1]"))
				.sendKeys(Keys.ENTER);
	}
	
	public void view_card() {
		List<WebElement> cardsize = driver.findElements(By.xpath("//form[@id='form-policy-filter']/div/div[3]/div/div[1]/div[3]/span[2]/a"));
		cardsCount = cardsize.size();
		cards = new String[cardsCount];
		for (int i = 0; i < cardsCount; i++) {
			cards[i] = cardsize.get(i).getAttribute("data-pp-title");
			System.out.println(cards[0]);
		}	
		

	}

}
