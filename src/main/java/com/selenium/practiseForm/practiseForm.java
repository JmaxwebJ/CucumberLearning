package com.selenium.practiseForm;

import org.openqa.selenium.By;

public class practiseForm {
	
	public static final String LAUNCH_BROWSER = "https://demoqa.com/automation-practice-form";
	
	public static final By FIRSTNAME = By.id("firstName");
	public static final By DATEPICKER = By.className("react-datepicker-wrapper");
	public static final By LASTNAME = By.id("lastName");	
	
	public static final By EMAIL = By.cssSelector("input[id=\"userEmail\"]");	
	
	public static final By GENDER = By.cssSelector("input[id=\"gender-radio-1\"]");	
	
	public static final By MOBILENUMBER = By.id("userNumber");	

	public static final By DOB= By.id("dateOfBirthInput");
	
	public static final By DATE_MONTH=By.cssSelector("select[class=\"react-datepicker__month-select\"]");
	
	public static final By DATE_YEAR= By.cssSelector(".react-datepicker__year-select");
	
	public static final By DATE_PICKER = By.cssSelector(".react-datepicker__day");
	
	
	public static final By SUBJECTS= By.cssSelector(".subjects-auto-complete__value-container input");	
	
	public static final By AUTOSUGGESTION_SUBJECTS= By.xpath("//div[@id='react-select-2-option-0']");
	
	public static final By HOBBIES= By.cssSelector("#hobbies-checkbox-1");	
	
	public static final By PICTURE= By.cssSelector("#uploadPicture");	
	
	public static final By ADDRESS= By.cssSelector("#currentAddress");	

	public static final By STATES= By.cssSelector("#state");

	public static final By STATE_VALUE = By.id("react-select-3-option-0");
	
	public static final By CITY= By.cssSelector("#city");
	
	public static final By CITY_VALUE = By.id("react-select-4-option-1");
	
	public static final By SUBMIT = By.id("submit");
	

	public static final By CONFIRMATION_POPUP = By.id("closeLargeModal");
	
	
}
