package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

class StraightThrough extends Random {
	
	private Random rand = new Random();
	private Precondition pr;
	private Sign_up sign_up = new Sign_up();
	private Sign_up_verification sign_up_ver = new Sign_up_verification();;
	private Personal_data per_data = new Personal_data();
	private Digital_sign dig_sign = new Digital_sign();
	

	@BeforeEach
	public void setUp() {	
		pr = new Precondition();		
		pr.setUp();
	}		

	@Test
	void test() {
		sign_up.getSignUp();
		sign_up.email.sendKeys("TDM_EMAIL@" + rand.get_int1(1) + ".com");
		sign_up.password.sendKeys("tosca!" + rand.get_int1(1));
		sign_up.phonecode.sendKeys(Integer.toString(rand.get_int2(1)));
		sign_up.phone.sendKeys(Integer.toString(rand.get_int3(1)));
		sign_up.submit.sendKeys(Keys.ENTER);

		sign_up_ver.getSignUpVerif();
		sign_up_ver.code.sendKeys(Integer.toString(rand.get_int4(1)));
		sign_up_ver.ver_but.submit();

		per_data.getPersonalData();
		per_data.first_name.sendKeys("John_" + rand.get_int1(1));
		per_data.last_name.sendKeys("Smith_" + rand.get_int1(1));
		per_data.address.sendKeys("Mira street 3/438");
		per_data.post_code.sendKeys(Integer.toString(rand.get_int5(1)));
		per_data.city.sendKeys("Saint-Petersbyrg");
		per_data.birthday.sendKeys("27/09/1988");
		per_data.conf_but.submit();

		dig_sign.getDig_Sign();
		Actions a = new Actions(Precondition.driver);
		a.build();
		a.moveToElement(dig_sign.canvas, 10, 5).clickAndHold(dig_sign.canvas).moveByOffset(5, 5).release(dig_sign.canvas);
		a.perform();
		dig_sign.fin_but.submit();
	}

	@AfterEach
	void tearDown() throws Exception {
		Precondition.driver.quit();
	}

}
