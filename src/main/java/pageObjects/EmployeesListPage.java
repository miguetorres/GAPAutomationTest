package pageObjects;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesListPage extends BasePage {
	private int position;
	public @FindBy(xpath =  "//a[text()='Employees Information']") WebElement tab_EmployeesInformation;
	public @FindBy(xpath =  "//div[@id='content']/table") WebElement table_ListingEmployees;
	

	
	
	public EmployeesListPage() throws IOException {
		super();
	}
	
	public EmployeesListPage clickOnCreateEmplyeesInformation() throws Exception {
		waitAndClickElement(tab_EmployeesInformation);
		return new EmployeesListPage();
	
	}
	
	public EmployeesListPage locateLeaderName(String leaderName) throws Exception {
		List<WebElement> listingEmployees = table_ListingEmployees.findElements(By.tagName("td"));
		//for each loop
		for (WebElement cell : listingEmployees) {
			if(cell.getText().equals(leaderName)) {
				position = listingEmployees.lastIndexOf(cell);
				System.out.println("text: " + cell.getText());
				System.out.println("Cell Found in position: "+ position);
				
				break;
				
			}else {
				System.out.println("Cell Not Found yet");
	
			}
			
		}
	
		
		return new EmployeesListPage();
	
	}
	public EmployeesListPage clickOnDeleteButton() throws Exception {
		waitAndClickElementsUsingByLocator(By.xpath("(//a[text()='Delete'])["+ position +"]"));
		return new EmployeesListPage();
	
	}
	
	

}
