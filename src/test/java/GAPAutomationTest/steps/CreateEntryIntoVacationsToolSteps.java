package GAPAutomationTest.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;


public class CreateEntryIntoVacationsToolSteps extends DriverFactory  {
	
	
	@Given("^User navigates to the vacations management login website \"([^\"]*)\"$")
	public void user_navigates_to_the_vacations_management_login_website(String url) throws Throwable {
		getDriver();
		driver.get(url);
	}
		

	
	
	@Given("^User enters a valid email \"([^\"]*)\"$")
	public void user_enters_a_valid_email(String email) throws Throwable {
		loginPage.enterEmail(email);
	}

	@Given("^User enters a valid password \"([^\"]*)\"$")
	public void user_enters_a_valid_password(String password) throws Throwable {
		loginPage.enterPassword(password);
	}
	
	
	@When("^Users clicks on the sign in button$")
	public void users_clicks_on_the_sign_in_button() throws Throwable {
	    loginPage.clickOnSignInButton();
	}

	@Then("^The user should be signed in successfully$")
	public void the_user_should_be_signed_in_successfully() throws Throwable {
		homePage.validateSuccessfulLogin();
	   
	}
	
	/**************************CREATE NEW USER STEPS****************************/

	@Given("^User clicks the create new employee button$")
	public void user_clicks_the_create_new_employee_button() throws Throwable {
		homePage.clickOnCreateEmplyeeButton();

	}
	
	@Given("^User enters the name \"([^\"]*)\"$")
	public void user_enters_the_name(String firstName) throws Throwable {
		createUserPage.enterFirstName(firstName);
	}

	@Given("^User enters the last name \"([^\"]*)\"$")
	public void user_enters_the_last_name(String lastName) throws Throwable {
		createUserPage.enterLastName(lastName);
	}

	@Given("^User enters the email \"([^\"]*)\"$")
	public void user_enters_the_email(String email) throws Throwable {
		createUserPage.enterEmail(email);
	}
	
	@Given("^User enters the identification \"([^\"]*)\"$")
	public void user_enters_the_identification(String id) throws Throwable {
		createUserPage.enterIdentification(id);
	}

	@Given("^User enters the leader name \"([^\"]*)\"$")
	public void user_enters_the_leader_name(String leaderName) throws Throwable {
		createUserPage.enterLeaderName(leaderName);
	}

	@Given("^User selects the year \"([^\"]*)\"$")
	public void user_selects_the_year(String year) throws Throwable {
	    createUserPage.selectYear(year);
	}

	@Given("^User selects the month \"([^\"]*)\"$")
	public void user_selects_the_month(String month) throws Throwable {
	    createUserPage.selectMonth(month);
	}

	@Given("^User selects the day \"([^\"]*)\"$")
	public void user_selects_the_day(String day) throws Throwable {
	    createUserPage.selectDay(day);
	}

	@When("^User clicks the create employee button$")
	public void user_clicks_the_create_employee_button() throws Throwable {
	    createUserPage.clickOnCreateEmplyeeButton();
	}

	@Then("^The new user is successfully created$")
	public void the_new_user_is_successfully_created() throws Throwable {
	    createUserPage.successfullyCreatedMessage();
	}
	
	/**************************EMPLOYEES LIST STEPS****************************/
	
	@Given("^User clicks the employees information tab$")
	public void user_clicks_the_employees_information_tab() throws Throwable {
	    employeesListPage.clickOnCreateEmplyeesInformation();
	}


	@Given("^User validates new employee leader name \"([^\"]*)\"$")
	public void user_validates_new_employee_leader_name(String leaderName) throws Throwable {
		employeesListPage.locateLeaderName(leaderName);
	}

	

	@When("^User clicks the delete button$")
	public void user_clicks_the_delete_button() throws Throwable {
		employeesListPage.clickOnDeleteButton();
		System.out.println("test");

	}

	@Then("^The user is successfully deleted$")
	public void the_user_is_successfully_deleted() throws Throwable {
		System.out.println("test");
	}




}
