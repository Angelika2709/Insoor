package us1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Reg_instances extends Sign_up{	
	Sign_up sign_up = new Sign_up();
	Sign_up_verification sign_up_ver = new Sign_up_verification();
	Personal_data per_data = new Personal_data();
	
	Random rand = new Random();
	int rand_int1 = 100 + (int)(Math.random()*(999));	
	int rand_int2 = 10 + (int)(Math.random()*(99));
	int rand_int3 = 100000001 + (int)(Math.random()*(999999999));
	int rand_int4 = 999 + (int)(Math.random()*(9999));
	private static final String CHAR_LIST = 
	        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    private static final int RANDOM_STRING_LENGTH = 10;
	    
	    public String generateRandomString(){
	         
	        StringBuffer randStr = new StringBuffer();
	        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
	            int number = getRandomNumber();
	            char ch = CHAR_LIST.charAt(number);
	            randStr.append(ch);
	        }
	        return randStr.toString();
	    }
	 
    
	
	public void StraightThrough() {
		sign_up.getSignUp();		
		sign_up.email.sendKeys("TDM_EMAIL@"+rand_int1+".com");
		sign_up.password.sendKeys("tosca!"+rand_int1);
		sign_up.phonecode.sendKeys(Integer.toString(rand_int2));
		sign_up.phone.sendKeys(Integer.toString(rand_int3));
		sign_up.submit.sendKeys(Keys.ENTER);
		
		sign_up_ver.getSignUpVerif();
		sign_up_ver.code.sendKeys(Integer.toString(rand_int4));
		sign_up_ver.ver_but.sendKeys(Keys.ENTER);

		
		per_data.getPersonalData();
		//per_data.first_name.sendKeys("John"+rand_str);
		
		
				
	}

}
