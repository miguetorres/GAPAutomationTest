package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage extends BasePage {
	public @FindBy(id = "employee_first_name") WebElement textfield_FirstName;
	public @FindBy(id = "employee_last_name") WebElement textfield_LastName;
	public @FindBy(id = "employee_email") WebElement textfield_Email;
	public @FindBy(id = "employee_identification") WebElement textfield_Identification;
	public @FindBy(id = "employee_leader_name") WebElement textfield_LeaderName;
	public @FindBy(id = "employee_start_working_on_1i") WebElement dropdown_Year;
	public @FindBy(id = "employee_start_working_on_2i") WebElement dropdown_Month;
	public @FindBy(id = "employee_start_working_on_3i") WebElement dropdown_Day;
	public @FindBy(css = "input[value=\"Create Employee\"]") WebElement button_CreateEmployee;
	public @FindBy(xpath =  "//p[(@id='notice')and(contains(text(),'successfully created'))]") WebElement message_SuccessfullyCreated;
	

	public CreateUserPage() throws IOException {
		super();
	}
	
	public CreateUserPage enterFirstName(String firstName) throws Exception {
		sendKeysToWebElement(textfield_FirstName, firstName);
		return new CreateUserPage();
	}
	
	public CreateUserPage enterLastName(String lastName) throws Exception {
		sendKeysToWebElement(textfield_LastName, lastName);
		return new CreateUserPage();
	}
	
	public CreateUserPage enterEmail(String email) throws Exception {
		sendKeysToWebElement(textfield_Email, email);
		return new CreateUserPage();
	}
	
	public CreateUserPage enterIdentification(String id) throws Exception {
		sendKeysToWebElement(textfield_Identification, id);
		return new CreateUserPage();
	}
	
	public CreateUserPage enterLeaderName(String leaderName) throws Exception {
		sendKeysToWebElement(textfield_LeaderName, leaderName);
		return new CreateUserPage();
	}
	
	public CreateUserPage selectYear(String year) throws Exception {
		Select selectYearDropdown = new Select(dropdown_Year);
		selectYearDropdown.selectByVisibleText(year);
		return new CreateUserPage();
	}
	
	public CreateUserPage selectMonth(String month) throws Exception {
		Select selectMonthDropdown = new Select(dropdown_Month);
		selectMonthDropdown.selectByVisibleText(month);
		return new CreateUserPage();
	}
	
	public CreateUserPage selectDay(String day) throws Exception {
		Select selectYearDropdown = new Select(dropdown_Day);
		selectYearDropdown.selectByVisibleText(day);
		return new CreateUserPage();
	}
	
	public CreateUserPage clickOnCreateEmplyeeButton() throws Exception {
		waitAndClickElement(button_CreateEmployee);
		return new CreateUserPage();
		
	}
	
	public CreateUserPage successfullyCreatedMessage() throws Exception {
		WaitUntilWebElementIsVisible(message_SuccessfullyCreated);
		return new CreateUserPage();
		
	}
	
	

}
