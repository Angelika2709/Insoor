package model;

import java.util.Collection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import appmanager.Insurer;
import appmanager.*;


public class InsNames {
	private String names;

	public InsNames(String names) {
		this.names = names;
	}

	public String returnInsurers() {
		return names;
	}
}
