package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

	    public SessionHelper(WebDriver wd) {
	        super(wd);
	    }

	    public void login(String username, String password) {
	        type(By.id("loginform-email"), username);
	        type(By.id("loginform-password"), password);
	        click(By.name("login-button"));	     
	    }	

}
