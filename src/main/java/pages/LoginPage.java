package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.dependencyInjection;

public class LoginPage {
	
	dependencyInjection deps;
	
	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement login;
	
	public LoginPage(dependencyInjection deps) {
		this.deps = deps;
		PageFactory.initElements(deps.getDriver(), this);
	}
	
	//Actions
	public String validateTitleLogin() {
		return deps.getDriver().getTitle();
	}
}
