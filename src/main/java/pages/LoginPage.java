package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.GlobalContext;

public class LoginPage {
	
GlobalContext deps;
	
	public LoginPage(GlobalContext deps) {
		this.deps = deps;
		PageFactory.initElements(deps.getDriver(),this);
	}
	
	@FindBy(name = "email")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement login;
	
	
	//Actions
	public String validateTitleLogin() {
		return deps.getDriver().getTitle();
	}
	
	public void login() {
		username.sendKeys("anil.kumar2080@gmail.com");
		password.sendKeys("Test@1234");
		login.click();
//		return new signOn(deps);
	}
}
