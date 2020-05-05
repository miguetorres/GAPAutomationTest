package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public @FindBy(css = ".flash_notice") WebElement banner_Successfully;
	public @FindBy(css = "img[alt='GAP Vacations Management']") WebElement logo_PageLogo;
	public @FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement button_LogOut;
	public @FindBy(xpath = "//*[contains(text(),'Create a new employee')]") WebElement button_CreateEmployee;

	public HomePage() throws IOException {
		super();
	}
	
	public HomePage clickOnCreateEmplyeeButton() throws Exception {
		scrollToElementByWebElementLocator(button_CreateEmployee);
		waitAndClickElement(button_CreateEmployee);
		return new HomePage();
		
	}
	
	public HomePage validateSuccessfulLogin() throws Exception {
		WaitUntilWebElementIsVisible(banner_Successfully);
		WaitUntilWebElementIsVisible(logo_PageLogo);
		WaitUntilWebElementIsVisible(button_LogOut);
		return new HomePage();
		
	}
	
	

}
