package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("We should be in home page")
	public void we_should_be_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KunalRaool\\Desktop\\SDET\\Cucumber project\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("Enter valid Name")
	public void enter_valid_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	@When("Enter valid Password")
	public void enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}
	@When("Click on Login Button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String expected = driver.findElement(By.id("welcome")).getText();
		String actual = "Welcome Paul";
		org.junit.Assert.assertEquals(expected, actual);
		driver.findElement(By.id("welcome")).click();
Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();;
		Thread.sleep(2000);
		driver.close();
	}

	
		@When("Enter invalid  Name")
		public void enter_invalid_name() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("txtUsername")).sendKeys("Admin111");
		}
		@When("Enter invalid Password")
		public void enter_invalid_password() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("txtPassword")).sendKeys("admin121113");
		}

		@Then("error message should displayed")
		public void error_message_should_displayed() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String error = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
			org.junit.Assert.assertEquals(error, "Invalid credentials");
			Thread.sleep(2000);
			driver.close();

		}



	
	
	
	
	
	
	
}
