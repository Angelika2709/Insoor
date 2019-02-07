package us2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

class Verify_current_policy {
	private Precondition_policy_view pr;
	private Upload_controls_view upl_view;
	private String total_s;

	@BeforeEach
	void setUp() throws Exception {
		pr = new Precondition_policy_view();
		pr.setup_enviroment();
		pr.autoriz();
		Precondition_policy_view.main_sidebar();
	}

	@SuppressWarnings("deprecation")
	@Test
	void test() throws Exception {
		go_to_policy();

		upl_view = new Upload_controls_view();

		upl_view.get_ins_types();
		/*->*/ upl_view.field_ins_types_pol.sendKeys(upl_view.pol_types[3]);

		upl_view.get_insur();
		/*->*/ upl_view.field_insur.sendKeys(upl_view.insurers_pol[4]);

		upl_view.get_data();
		/*->*/ upl_view.beg_per.sendKeys(upl_view.date_values[1]);
		upl_view.end_per.sendKeys(upl_view.date_values[2]);

		upl_view.get_price();
		/*->*/ upl_view.field_price.sendKeys(upl_view.price_values[0]);

		// Загрузка и проверка файла
		Browse_file br = new Browse_file();
		br.get_file();
		Assert.assertEquals("policy.pdf", br.input.getAttribute("title"));

		// Проверка загруженного полиса
		total_s = (upl_view.pol_types[3] + "/" + upl_view.insurers_pol[4] + " (" + upl_view.date_values[1] + "-"
				+ upl_view.date_values[2] + ")");
		upl_view.submit_pol();
		get_verif();
	}

	private void get_verif() {
		upl_view.view_card();
		pr.driver.get("http://foo.bar");
		Assert.assertEquals(total_s, upl_view.title);
		pr.sign_out();
	}

	private void go_to_policy() {
		pr.driver.navigate().to(pr.links[28]);
		pr.driver.findElement(By.id("new_policy")).click();
		// ожидание загрузки формы
		WebDriverWait wait = new WebDriverWait(pr.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("form-policy-filter")));
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		this.pr = null;
		pr.driver.close();
	}

}
