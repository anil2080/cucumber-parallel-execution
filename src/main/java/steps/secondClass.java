package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;
import pages.signOn;

public class secondClass {
	
RegisterPage registerObj;
	
	public secondClass(RegisterPage registerObj) {
		this.registerObj = registerObj;
	}
	
	@Given("user is already on Register page")
	public void user_is_already_on_Register_page() throws InterruptedException {
		System.out.println("In given 3");
//		registerObj.clickRegisterLink();
//		System.out.println(registerObj.validateRegisterTitle());
	}

	@When("user enters all register details")
	public void user_enters_all_register_details() throws InterruptedException {
		System.out.println("In when 3");
//		registerObj.fillInfo();		
	}
	
	@Then("user gets registered")
	public void user_gets_registered() throws InterruptedException {
		System.out.println("In then 3");
		
	}
}
