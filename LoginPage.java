package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public ChromeDriver driver;
	@Given("Launch the chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();		
	}
	
	@And("Load the URL and maximize")
	public void loadAndMaximize() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@Given("Type the username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Type the password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("verify the home page is displayed")
	public void verifyHomePage() {
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("Home page is displayed");			
		}else {
			System.err.println("Home page is not displayed");
		}
	}

	@But("verify the error message is displayed")
	public void verifyErrorMessage() {
		String text=driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}
}
