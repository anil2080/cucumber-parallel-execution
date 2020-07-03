package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetUtility implements browserUtility {

	WebDriver driver = null;

	public void launchIE() {
		System.out.println("launching internet Explorer!!");
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getBrowserName() {
		return "Chrome IE";
	}
	
}