package us4;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Email_Invalid {
	private Random rand = new Random();
	private Precondition pr;
	private Sign_up sign_up = new Sign_up();

	@BeforeEach
	public void setUp() {
		pr = new Precondition();
		pr.setUp();
	}

	@Test
	void test() {
		sign_up.getSignUp();
		sign_up.email.sendKeys("TDM_EMAIL@" + rand.get_int1());

		sign_up.password.sendKeys("tosca!" + rand.get_int1());
		sign_up.phonecode.sendKeys(Integer.toString(rand.get_int2()));
		sign_up.phone.sendKeys(Integer.toString(rand.get_int3()));
		sign_up.submit.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(pr.driver, 10);
		WebElement error = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='form-signup']/div[1]/p")));
		Assert.assertEquals(error.getText(), "Email is not a valid email address.");
		}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr=null;
		this.rand=null;
		this.sign_up=null;
		pr.driver.close();
		}

}
