package tests;

import static org.junit.jupiter.api.Assertions.*;
import models.OfferData;
import us1.Upload_policy_controls;

import org.junit.jupiter.api.Test;

import appmanager.NavigationHelper;

class Request_new_offer_ST extends TestBase {

	@Test
	void testRequestOffer() {
		app.getNavigationHelper().main_sidebar();
		app.getNavigationHelper().go_to_policy();

		app.getNavigationHelper().sign_out();

	}

}
