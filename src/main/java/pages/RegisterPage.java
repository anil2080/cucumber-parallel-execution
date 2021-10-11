package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.GlobalContext;

public class RegisterPage {
	
GlobalContext deps;
	
	public RegisterPage(GlobalContext deps) {
		this.deps = deps;
		PageFactory.initElements(deps.getDriver(),this);
	}
	
	@FindBy(name = "firstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name = "register")
	WebElement register;
	
	// Actions
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public String validateRegisterTitle() {
		return deps.getDriver().getTitle();
	}
	
	public void fillInfo() {
		firstName.sendKeys("First");
		lastName.sendKeys("last");
		email.sendKeys("email@email.com");
		password.sendKeys("password");
		confirmPassword.sendKeys("password");
		register.click();
	}

}
