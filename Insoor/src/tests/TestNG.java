package tests;

import org.testng.annotations.Test;

import model.InsNames;
import model.InsTypes;

import org.testng.annotations.BeforeMethod;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import model.*;
import appmanager.ApplicationManager;
import appmanager.InsuranceType;
import appmanager.NavigationHelper;
import appmanager.Insurer;

public class TestNG extends TestBase{
	
	
	@Test
	public void main()  {
		app.getNavigationHelper().main_sidebar();
		
		app.getNavigationHelper().go_to_policy();
		
		app.getInsuranceType().getTypes(new InsTypes("Estate"));
		app.getInsurerName().getInsurer(new InsNames("PAX"));
		app.datesHelper.data("12/02/2019", "12/03/2019");
		
		app.priceHelper.price("300");
		
		app.getNavigationHelper().submit_pol();
		app.getNavigationHelper().close_pol();
	}
	

}
