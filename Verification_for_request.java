package us3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.sun.xml.internal.bind.api.ErrorListener;

class Verification_for_request extends Precondition {
	WebElement mes_mar_st, mes_ins_type, mes_beg, mes_end, mes_pay, mes_sus;
		

	public void getMessagesErrors() {
		mes_mar_st = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Marital Status cannot be blank.')]"));
		/*mes_ins_type = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Insurance Type ID cannot be blank.')]"));
		mes_beg = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Begin of desirable period cannot be blank.')]"));
		mes_end = Precondition.driver.findElement(By.xpath("//p[contains(text(),'End of desirable period cannot be blank.')]"));
		mes_pay = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Payment period cannot be blank.')]"));
		mes_sus = Precondition.driver.findElement(By.xpath("//p[contains(text(),'Alert!')]"));*/
	
		
		
			if	(Request_new_offer.statuses[0].contains("Choose status")) { 
				mes_mar_st.isDisplayed();
				Request_new_offer close_but = new Request_new_offer();
				close_but.close_req();
				}
			/*else if (Request_new_offer.types[0]=="Choose type") {
 		mes_ins_type.isDisplayed(); sub_but.close_req(); } 
 	else if
	(Request_new_offer.date_values[0]=="dd/MM/yyyy") { mes_beg.isDisplayed();
	sub_but.close_req(); } 
 	else if
 	(Request_new_offer.date_values[0]=="dd/MM/yyyy") { mes_end.isDisplayed();
 	sub_but.close_req(); } 
 	else if (Request_new_offer.per[0]=="Choose period") {
 		mes_pay.isDisplayed(); 
 		sub_but.close_req(); } 
 	else { sub_but.submit_req();
 	System.out.println("Alert!"); 
 	} */
			}
}
