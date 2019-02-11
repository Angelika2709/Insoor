package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Types;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appmanager.InsuranceType;
import appmanager.NavigationHelper;

class Request_new_offer_ST extends TestBase {
	
	@Test
	void testRequestOffer() throws Exception {
		app.getNavigationHelper().main_sidebar();
		Thread.sleep(5000);
		app.getNavigationHelper().go_to_policy();
		Thread.sleep(3000);	
		app.getInsuranceType().setInstTypes();
		
	}

}

