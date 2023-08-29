package javamethod;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Hooks;

public class BrowserWindows {
	
	private WebDriver driver;
	public BrowserWindows()
	{
		driver= Hooks.driver;
	}
	
	@When("User click on New Tab")
	public void user_click_on_new_tab(WebDriver driver) {
		BrowserWindowsMethods.newTabs(driver);
	}

	
	@And("User close the newly opened tab")
	public void user_close_the_newly_opened_tab(WebDriver driver) {
	    BrowserWindowsMethods.closeNewTab(driver);
	}

	@And("User opened the new Window")
	public void user_opened_the_new_window(WebDriver driver) {
		BrowserWindowsMethods.newWindows(driver);
	}

	@And("User close the newly opened window")
	public void user_close_the_newly_opened_windows(WebDriver driver) {
	    BrowserWindowsMethods.closeNewWindow(driver);
	}

	@And("User click on New Window Message")
	public void user_click_on_new_window_message(WebDriver driver) {
	    BrowserWindowsMethods.newWindowMessage(driver);
	}

	@Then("Close the New Window Message")
	public void close_the_new_window_message(WebDriver driver) {
		BrowserWindowsMethods.closeNewWindowMessage(driver);
	}

}
