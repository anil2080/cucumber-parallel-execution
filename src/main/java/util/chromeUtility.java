package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeUtility implements browserUtility {

	WebDriver driver = null;

	public void launchChrome() {
		System.out.println("launching Chrome!!");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getBrowserName() {
		return "Chrome Browser";
	}
}
