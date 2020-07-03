package util;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class dependencyInjection {
	
	WebDriver driver;
	LoginPage loginPageObject;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
