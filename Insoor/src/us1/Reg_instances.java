package us1;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reg_instances extends Sign_up{	
	Sign_up sign_up = new Sign_up();
	Sign_up_verification sign_up_ver = new Sign_up_verification();
	Personal_data per_data = new Personal_data();
	
	Random rand = new Random();
	int rand_int1 = 100 + (int)(Math.random()*(999));	
	int rand_int2 = 10 + (int)(Math.random()*(99));
	int rand_int3 = 100000001 + (int)(Math.random()*(999999999));
	int rand_int4 = 999 + (int)(Math.random()*(9999));	
	int rand_int5 = 100001 + (int)(Math.random()*(999999));
    
	
	public void StraightThrough() {
		sign_up.getSignUp();		
		sign_up.email.sendKeys("TDM_EMAIL@"+rand_int1+".com");
		sign_up.password.sendKeys("tosca!"+rand_int1);
		sign_up.phonecode.sendKeys(Integer.toString(rand_int2));
		sign_up.phone.sendKeys(Integer.toString(rand_int3));
		sign_up.submit.sendKeys(Keys.ENTER);
		
		sign_up_ver.getSignUpVerif();
		sign_up_ver.code.sendKeys(Integer.toString(rand_int4));
		sign_up_ver.ver_but.submit();

	
		per_data.getPersonalData();
		per_data.first_name.sendKeys("John_"+rand_int1);
		per_data.last_name.sendKeys("Smith_"+rand_int1);
		per_data.address.sendKeys("Mira street 3/438");
		per_data.post_code.sendKeys(Integer.toString(rand_int5));
		per_data.city.sendKeys("Saint-Petersbyrg");
		per_data.birthday.sendKeys("27/09/1988");
		per_data.conf_but.submit();
		
				
	}

}
