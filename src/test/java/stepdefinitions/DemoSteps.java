package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.DemoPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	
	private DemoPage DemoPage = new DemoPage(DriverFactory.getDriver());

	@Given("user is navigated into bank demo website")
	public void user_navigates_to_contact_us_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(5000);
	}
	
	

		@Given("user is on Demo banking page")
		public void user_is_on_demo_banking_page() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(DemoPage.verify_home_page(), "Home Page not displayed");
		
		}

		@When("user enters the user name")
		public void user_enters_the_user_name() {
		    // Write code here that turns the phrase above into concrete actions
			DemoPage.enterUserName("gangadharan");
		}

		@When("the user enters the password")
		public void the_user_enters_the_password() {
		    // Write code here that turns the phrase above into concrete actions
			DemoPage.enter_password("dummypass");
			
		}
		@Then("verify")
		public void verify() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(2000);
			Assert.assertTrue(DemoPage.verify_login(), "Bug on incorrect login");
		}


}
