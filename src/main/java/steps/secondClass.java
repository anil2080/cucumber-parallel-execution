package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class secondClass {
	
	WebDriver driver = null;
		
	@Given("user is already on login page 3")
	public void user_is_already_on_login_page_3() throws InterruptedException {
		System.out.println("In given 3");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("title of the page is Google 3")
	public void title_of_the_page_is_Google_3() throws InterruptedException {
		System.out.println("In when 3");
		Thread.sleep(1000);
	}
	
	@Then("user closes the browser 3")
	public void user_closes_the_browser_3() throws InterruptedException {
		System.out.println("In then 3");
		Thread.sleep(1000);
	}
}
