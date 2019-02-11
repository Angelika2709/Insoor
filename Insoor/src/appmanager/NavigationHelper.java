package appmanager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NavigationHelper extends HelperBase{	
	private static int linksCount = 0;
	private static String[] links = null;
	
	public NavigationHelper(WebDriver wd) {
        super(wd);
    }	
	
	// ������ ����
		public static void main_sidebar(){
			List<WebElement> linksize = wd.findElements(By.tagName("a"));
			linksCount = linksize.size();
			links = new String[linksCount];
			for (int i = 0; i < linksCount; i++) {
				links[i] = linksize.get(i).getAttribute("href");			
			}
			wd.navigate().to(links[25]);		
		}
		
		public void go_to_policy() {
			wd.navigate().to(links[28]);
			wd.findElement(By.id("new_policy")).click();
			
			// ��������
			WebDriverWait wait = new WebDriverWait(wd, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("form-policy-filter")));
		}
		
		// �������������
		public static void sign_out() {
			WebDriverWait wait = new WebDriverWait(wd, 10);
			WebElement sign_out_but = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='fa fa-sign-out']")));
			sign_out_but.sendKeys(Keys.ENTER);
		}
		

}
