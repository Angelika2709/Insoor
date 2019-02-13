package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Types;
import model.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import appmanager.InsuranceType;
import appmanager.NavigationHelper;

class UploadNewPolicy extends TestBase {
	

	@Test
	void testRequestOffer() throws Exception {
		app.getNavigationHelper().main_sidebar();
		Thread.sleep(5000);
		app.getNavigationHelper().go_to_policy();
		Thread.sleep(3000);

		app.getInsuranceType().getTypes(new InsTypes("All types"));	
		app.getInsurerName().getInsurer(new InsNames("PAX"));
		app.datesHelper.data("12/02/2019", "12/02/2020");
		Thread.sleep(3000);
		app.priceHelper.price("200");
		Thread.sleep(3000);
		boolean dd = app.getInsuranceType().getTypes();
		if (dd == true){
			app.getInsuranceType().error.getText();
			System.out.println("Insurance Type ID cannot be blank.");
		}
		else {
		app.getNavigationHelper().submit_pol();
		app.getNavigationHelper().close_pol();
	}
}
}