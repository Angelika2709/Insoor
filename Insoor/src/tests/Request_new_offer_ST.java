package tests;

import static org.junit.jupiter.api.Assertions.*;
import models.PolicyData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appmanager.NavigationHelper;

class Request_new_offer_ST extends TestBase {

	@Test
	void testRequestOffer() {
		app.getNavigationHelper().main_sidebar();
		app.getNavigationHelper().go_to_policy();
		app.getPolicyHelper().get_ins_types();
		
		//app.getOfferData().get_insur();		
		//app.getNavigationHelper().sign_out();

	}

}
