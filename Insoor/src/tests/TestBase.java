package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.BrowserType;

import appmanager.ApplicationManager;

public class TestBase {
	
	protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

	@BeforeEach
	void setUp() throws Exception {
		 app.init();
	}

	@AfterEach
	void tearDown() throws Exception {
		 app.stop();
	}
}
