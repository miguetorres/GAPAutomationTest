package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public @FindBy(id = "user_email") WebElement textfield_Email;
	public @FindBy(id = "user_password") WebElement textfield_Password;
	public @FindBy(xpath = "//input[@class = 'submit']") WebElement button_SignIn;

	public LoginPage() throws IOException {
		super();
		
	}
	
	
	
	public LoginPage enterEmail(String email) throws Exception {
		sendKeysToWebElement(textfield_Email, email);
		return new LoginPage();
	}
	
	public LoginPage enterPassword(String password) throws Exception {
		sendKeysToWebElement(textfield_Password, password);
		return new LoginPage();
	}
	
	public LoginPage clickOnSignInButton() throws Exception {
		waitAndClickElement(button_SignIn);
		return new LoginPage();
	}
	
	

}
