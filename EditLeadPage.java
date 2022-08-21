package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadPage extends ProjectSpecificMethods{
	
	@Given("Click Find Leads Link")
	public void clickFindLeadsLink() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Keerthika");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10918']")).click();
		driver.navigate().refresh();
	}
	@And("Click on Edit Leads Link")
	public void clickEditLeadsLink() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@When("Update the company name as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
	@Then("Submit the updated Lead")
	public void updateLeadInfo() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}
