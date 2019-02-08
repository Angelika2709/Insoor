package us2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import us2.Upload_controls_view;

public class Browse_file extends Upload_controls_view {

	public WebElement browse, input;
	public StringSelection ss;

	// Browse a file
	public void get_file() throws Exception {
		browse = driver.findElement(By.cssSelector("div[class='btn btn-primary btn-file']"));
		browse.click();

		ss = new StringSelection("policy.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(50);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(50);
		
		input = driver.findElement(By.xpath("//input[@class='file-caption-name']"));

	}

}
