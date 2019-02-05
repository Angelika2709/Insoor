package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

class StraightThrough extends Random{

	@BeforeEach
	public void setUp() {
		setUp();		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	

	@Test
	void test(int x) {
		getSignUp();		
		email.sendKeys("TDM_EMAIL@"+rand_int1(x)+".com");
		password.sendKeys("tosca!"+rand_int1(x));
		phonecode.sendKeys(Integer.toString(rand_int2(x)));
		phone.sendKeys(Integer.toString(rand_int3(x)));
		submit.sendKeys(Keys.ENTER);
		
		getSignUpVerif();
		code.sendKeys(Integer.toString(rand_int4(x)));
		ver_but.submit();
	
		getPersonalData();
		first_name.sendKeys("John_"+rand_int1(x));
		last_name.sendKeys("Smith_"+rand_int1(x));
		address.sendKeys("Mira street 3/438");
		post_code.sendKeys(Integer.toString(rand_int5(x)));
		city.sendKeys("Saint-Petersbyrg");
		birthday.sendKeys("27/09/1988");
		conf_but.submit();		
		
		getDig_Sign();
		Actions a = new Actions(driver);
		a.build();
		a.moveToElement(canvas,10,5).clickAndHold(canvas).moveByOffset(5,5).release(canvas); 
		a.perform();
		fin_but.submit();
	}



}
