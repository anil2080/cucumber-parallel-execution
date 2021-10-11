package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.signOn;
import util.GlobalContext;

public class firstClass {

	LoginPage loginPageObject;
	signOn signOnObj;
	
	public firstClass(LoginPage loginPageObject, signOn signOnObj) {
		this.loginPageObject = loginPageObject;
		this.signOnObj = signOnObj;
	}

	@Given("user is already on login page")
	public void user_is_already_on_login_page() throws InterruptedException {
		System.out.println("In given 1");
		System.out.println(loginPageObject.validateTitleLogin());
	}

	@When("title of the page is Google")
	public void title_of_the_page_is_Google() throws InterruptedException {
		System.out.println("In when 1");
		loginPageObject.login();
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		System.out.println("In then 1");
		System.out.println(signOnObj.validateSignOnTitle());
	}

	@Given("user is already on login page 2")
	public void user_is_already_on_login_page_2() throws InterruptedException {
		System.out.println("In given 2");
	}

	@When("title of the page is Google 2")
	public void title_of_the_page_is_Google_2() throws InterruptedException {
		System.out.println("In when 2");
		
	}

	@Then("user closes the browser 2")
	public void user_closes_the_browser_2() throws InterruptedException {
		System.out.println("In then 2");
		Thread.sleep(1000);
	}
}
