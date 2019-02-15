package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Types;
import model.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import appmanager.InsuranceType;
import appmanager.Insurer;
import appmanager.NavigationHelper;

class UploadNewPolicy extends TestBase {

	@Test
	void testRequestOffer() throws Exception {
		app.getNavigationHelper().main_sidebar();
		Thread.sleep(5000);
		app.getNavigationHelper().go_to_policy();
		Thread.sleep(3000);
		app.getInsuranceType().getTypes(new InsTypes("Estate"));
		app.getInsurerName().getInsurer(new InsNames("PAX"));
		app.datesHelper.data("12/02/2019", "12/03/2019");
		Thread.sleep(3000);
		app.priceHelper.price("300");
		Thread.sleep(3000);
		verifications();
	}

	private void verifications() {
		app.getNavigationHelper().submit_pol();
		app.getInsuranceType().verificationType();
		app.getInsurerName().verificationInsurer();
		app.datesHelper.verificationDates();
		app.priceHelper.verificationPrice();
		app.getNavigationHelper().close_pol();
	}

}
