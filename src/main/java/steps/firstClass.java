package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.dependencyInjection;

public class firstClass {

	dependencyInjection deps;
	
	public firstClass(dependencyInjection deps) {
		this.deps = deps;
	}

	@Given("user is already on login page")
	public void user_is_already_on_login_page() throws InterruptedException {
		System.out.println("In given 1");
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		deps.setDriver(driver);
	}

	@When("title of the page is Google")
	public void title_of_the_page_is_Google() throws InterruptedException {
		System.out.println("In when 1");
		System.out.println(deps.getDriver().getTitle());
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		System.out.println("In then 1");
		Thread.sleep(1000);
	}

	@Given("user is already on login page 2")
	public void user_is_already_on_login_page_2() throws InterruptedException {
		System.out.println("In given 2");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
		deps.getDriver().get("http://newtours.demoaut.com/");
	}

	@When("title of the page is Google 2")
	public void title_of_the_page_is_Google_2() throws InterruptedException {
		System.out.println("In when 2");
		Thread.sleep(1000);
	}

	@Then("user closes the browser 2")
	public void user_closes_the_browser_2() throws InterruptedException {
		System.out.println("In then 2");
		Thread.sleep(1000);
	}
}
