package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.PracticeMethods;


public class PracticeFormSteps {
	
	private WebDriver driver;
	public PracticeFormSteps()
	{
		driver= Hooks.driver;
	}
	@Given("User is on {string} page")
	public void user_is_on_page(String str) {
		PracticeMethods.launchBrowser(driver,str);
		
	}
	
	
	@When("User enters firstNme as {string}, Last name as {string} and email as {string}")
	public void user_enters_first_nme_as_last_name_as_and_email_as(String fname, String lname, String email) {
		PracticeMethods.firstName(driver, fname);
		PracticeMethods.lastName(driver, lname);
		PracticeMethods.Email(driver, email);
		
	}
	@And("User click on gender as {string}")
	public void user_click_on_gender_as(String gender) {
	    PracticeMethods.Gender(driver, gender);
	}
	
	@And("Enter Mobile number as {string}")
	public void enter_mobile_number_as(String MobileNumber) {
		PracticeMethods.MobileNumber(driver, MobileNumber);
	}
	@And("User Enters Subject as {string} , Hobbies as {string}, Select Date and address as {string}")
	public void user_enters_subject_as_hobbies_as_select_date_and_address_as(String Subject1, String Hobbies1, String address1) throws InterruptedException {
		PracticeMethods.Subject(driver, Subject1);
		PracticeMethods.Hobbies(driver, Hobbies1);
		PracticeMethods.SelectDate(driver);
		PracticeMethods.address(driver, address1);
	}
	
	@And("Upload the picture")
	public void upload_the_picture() throws InterruptedException {
		PracticeMethods.UploadPic(driver);
	}
	
	@And("Select state as {string} and city as {string}")
	public void select_state_as_and_city_as(String state1, String city1) {
		PracticeMethods.state(driver, state1);
		PracticeMethods.city(driver, city1);
	}
	
	@And("Click on the submit button")
	public void click_on_the_submit_button() {
	    PracticeMethods.submit(driver);
	}
	@Then("User should register successfully into the portal")
	public void user_should_register_successfully_into_the_portal() throws InterruptedException {
		PracticeMethods.CheckRegisterd(driver);
	}

}
