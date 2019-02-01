package us3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Request_new_offer extends Request_TestCases {
	
	public static void main(String[] args) throws Exception {
		setup_enviroment();
		autoriz();
		main_sidebar();
		driver.navigate().to(links[28]);
		driver.findElement(By.id("new_offer")).click();
		
		// ожидание загрузки кнопки
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("modalHeader")));
		Request_TestCases req = new Request_TestCases();
		// #1 : req.req_new_Straight_Through();
		// #2 : req.req_new_Mar_st_empty();
		// #3 :	req_new_Pay_per_Empty();
		// #4 : req_new_Beg_per_Empty();
		req.req_new_End_per_Empty();
		driver.navigate().to(links[25]);
		driver.close();
	}

}
