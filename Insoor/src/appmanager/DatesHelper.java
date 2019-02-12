
package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatesHelper extends HelperBase {

	public DatesHelper(WebDriver wd) {
		super(wd);
	}

	public void data(String begin, String end) {
		type(By.id("start_datepicker"), begin);
		type(By.id("end_datepicker"), end);

	}
}
