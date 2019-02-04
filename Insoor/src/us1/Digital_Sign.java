package us1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Digital_Sign extends Personal_data{
	WebElement canvas, fin_but;
	
	public void getSign() {
		canvas = driver.findElement(By.xpath("//*[@class='jSignature sign__jSignature'"));	
		fin_but = driver.findElement(By.xpath("//*[@name='regfin-button'"));		
	}
}
