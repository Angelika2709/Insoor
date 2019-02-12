package model;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import appmanager.InsuranceType;

public class InsTypes {
	InsuranceType types;
	
	public InsTypes(InsuranceType types) {
        this.types = types;
    }
	
	public void returnInstTypes() {
		for(String x: types.getTypes()){
            System.out.println(x);
        }	
		
	}

}
