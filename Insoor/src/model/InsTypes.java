package model;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import appmanager.InsuranceType;
import appmanager.*;

public class InsTypes {
	private String types;

	public InsTypes(String types) {
		this.types = types;
	}

	public String returnInstTypes() {
		return types;
	}
}
