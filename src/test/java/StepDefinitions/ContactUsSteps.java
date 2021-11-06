package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import Factory.DriverFactory;
import Implementation.ContactUsPage;
import Util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

	private ContactUsPage contactUsPage=new ContactUsPage(DriverFactory.getDriver());
	
	@Given("user navigates to contact us page")
	public void user_navigates_to_contact_us_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=contact");
	}

	@When("user fiils the form from given sheetname {string} and rownumber {int}")
	public void user_fiils_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("C:/Users/Dipyaman Sen/OneDrive/Desktop/automation.xlsx", sheetName);
		
		String heading=testData.get(rowNumber).get("subjectheading");
		String email=testData.get(rowNumber).get("email");
		String orderRef=testData.get(rowNumber).get("orderref");
		String message=testData.get(rowNumber).get("message");
		
		contactUsPage.fillContactUsForm(heading, email, orderRef, message);
	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		contactUsPage.clickSend();
	}

	@Then("it shows a successful message {string}")
	public void it_shows_a_successful_message(String expSuccessMessage) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String actualSuccessMessage=contactUsPage.getSuccessMessg();
		Assert.assertEquals(actualSuccessMessage, expSuccessMessage);
	}
}
