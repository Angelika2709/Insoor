package us1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

class InvalidEmail extends Random{

	@BeforeEach
	public void setUp() {
		setUp();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test(int x) {
		getSignUp();		
		email.sendKeys("TDM_EMAIL@"+rand_int1(x));
		
		String message = "Nattu";
		assertEquals(message, driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div[1]/p")).getText());
		System.out.println("oj");			
				
		password.sendKeys("tosca!"+rand_int1(x));
		phonecode.sendKeys(Integer.toString(rand_int2(x)));
		phone.sendKeys(Integer.toString(rand_int3(x)));
		submit.sendKeys(Keys.ENTER);
	}

}
