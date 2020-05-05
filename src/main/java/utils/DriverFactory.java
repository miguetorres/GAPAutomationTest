package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CreateUserPage;
import pageObjects.EmployeesListPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class DriverFactory {
	
public static WebDriver driver;
public static LoginPage loginPage;
public static HomePage homePage;
public static CreateUserPage createUserPage; 
public static EmployeesListPage employeesListPage;

	public WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", 
				"/Users/migue/Desktop/GAP/GAPAutomationTest/resources/geckodriver");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		homePage = PageFactory.initElements(driver, HomePage.class);
		createUserPage = PageFactory.initElements(driver, CreateUserPage.class);
		employeesListPage = PageFactory.initElements(driver, EmployeesListPage.class);
		return driver;
	}

}
