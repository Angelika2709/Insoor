package us2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.Assert;
import us3.Precondition_req_new;


class Verify_current_policy {
	private Precondition_policy_view pr;
	private Upload_controls_view upl_view;
	private String total_s;
				
	@BeforeEach
	void setUp() throws Exception {
		pr = new Precondition_policy_view();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_policy_view.main_sidebar();
	}
	

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		go_to_policy();			
		upl_view = new Upload_controls_view();
		
		upl_view.get_ins_types();		
		/*->*/ upl_view.field_ins_types_pol.sendKeys(Upload_controls_view.pol_types[3]);
						
		upl_view.get_insur();
		/*->*/ upl_view.field_insur.sendKeys(Upload_controls_view.insurers_pol[4]);
				
		upl_view.get_data();
		/*->*/ upl_view.beg_per.sendKeys(Upload_controls_view.date_values[1]);
		upl_view.end_per.sendKeys(Upload_controls_view.date_values[2]);
		
		upl_view.get_price();
		/*->*/ upl_view.field_price.sendKeys(Upload_controls_view.price_values[0]);	
		
		total_s = (Upload_controls_view.pol_types[3]+"/"+Upload_controls_view.insurers_pol[4]+" ("+Upload_controls_view.date_values[1]+"-"+Upload_controls_view.date_values[2]+")");
		System.out.println("total_s "+total_s);
		upl_view.submit_pol();
		upl_view.close_pol();					
		get_verif();		
	}


	private void get_verif() {
		pr.driver.navigate().to(pr.driver.getCurrentUrl()); 
		upl_view.view_card();
		upl_view.card.click();
		System.out.println("card "+upl_view.card.getAttribute("data-pp-title"));
		pr.sign_out();
	}

	private void go_to_policy() {
		Precondition_policy_view.driver.navigate().to(Precondition_policy_view.links[28]);
		Precondition_policy_view.driver.findElement(By.id("new_policy")).click();		
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(Precondition_policy_view.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("form-policy-filter")));
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr=null;
		pr.driver.close();
	}

}
