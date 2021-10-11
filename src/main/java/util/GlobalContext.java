package util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class GlobalContext {

	private WebDriver driver;
	private Properties prop;
	private FileInputStream fis;

	@Before()
	public void init() throws Exception {
		prop = new Properties();
		fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\utility.properties");
		prop.load(fis);
		String browser = prop.getProperty("browserName");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After()
	public void destruct() {
		driver.close();
		driver.quit();
	}

}
