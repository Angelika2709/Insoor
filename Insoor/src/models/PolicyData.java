package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appmanager.HelperBase;
import appmanager.InsuranceType;
import appmanager.NavigationHelper;

public class PolicyData {
	private String[] types;

	public PolicyData(String[] types) {
		this.types = types;
	}
	
	public String [] getTypes() {
		return types;
	}

}
