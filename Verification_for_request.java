package us3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class Verification_for_request extends Precondition {
	public WebElement mes_mar_st, mes_ins_type, mes_beg, mes_end, mes_pay, mes_sus;		

	public void errors_req_new() {
		mes_mar_st = Precondition.driver
				.findElement(By.xpath("//p[contains(text(),'Marital Status cannot be blank.')]"));
		mes_ins_type = Precondition.driver
				.findElement(By.xpath("//p[contains(text(),'Insurance Type ID cannot be blank.')]"));
		System.out.println(mes_ins_type.getText());
		mes_beg = Precondition.driver
				.findElement(By.xpath("//p[contains(text(),'Begin of desirable period cannot be blank.')]"));
		mes_end = Precondition.driver
				.findElement(By.xpath("//p[contains(text(),'End of desirable period cannot be blank.')]"));
		mes_pay = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Payment period cannot be blank.')]"));
		mes_sus = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Alert!')]"));
		
		Request_new_offer sub_but = new Request_new_offer();
		
		if (Request_new_offer.statuses[0].contains("Choose status")) {
			mes_mar_st.isDisplayed();
			sub_but.close_req();
		}/* else if (Request_new_offer.types[0].contains("Choose type")) {
			mes_ins_type.isDisplayed();
			sub_but.close_req();
		} else if (Request_new_offer.date_values[0].contains("dd/MM/yyyy")) {
			mes_beg.isDisplayed();
			sub_but.close_req();
		} else if (Request_new_offer.date_values[0].contains("dd/MM/yyyy")) {
			mes_end.isDisplayed();
			sub_but.close_req();
		} else if (Request_new_offer.per[0].contains("dd/MM/yyyy")) {
			mes_pay.isDisplayed();
			sub_but.close_req();
		}*/ else {
			sub_but.submit_req();
			System.out.println("Alert!");
		}
	}
}
