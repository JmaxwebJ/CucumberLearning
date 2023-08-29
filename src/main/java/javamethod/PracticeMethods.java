package javamethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.practiseForm.practiseForm;

import io.netty.handler.timeout.TimeoutException;



public class PracticeMethods {
	
	
	public static String filePath = "TestData/TestImage.png";

	public static void launchBrowser(WebDriver driver, String url) {
		try {
			driver.get(practiseForm.LAUNCH_BROWSER);
		} catch (TimeoutException e) {
			System.out.println("Issue in Launch Browser");
		}
		
		
	}

	public static void firstName(WebDriver driver, String fname) {
		try {
			driver.findElement(practiseForm.FIRSTNAME).sendKeys(fname);
			
		} catch (NoSuchElementException e) {
			System.out.println("Issue in Launch Browser");
		}
		
	}

	public static void lastName(WebDriver driver, String lname) {
		try {
			driver.findElement(practiseForm.LASTNAME).sendKeys(lname);
			
		} catch (NoSuchElementException e) {
			System.out.println("Issue in Launch Browser");
		}
		
	}

	public static void Email(WebDriver driver,  String email) {
		try {
			driver.findElement(practiseForm.EMAIL).sendKeys(email);
			
		} catch (NoSuchElementException e) {
			System.out.println("Issue in Launch Browser");
		}
		
	}

	public static void Gender(WebDriver driver, String gender) {
		try {
				WebElement element = driver.findElement(practiseForm.GENDER);
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().build().perform();
			
		} catch (NoSuchElementException e) {
			System.out.println("Issue in Launch Browser");
		} 
		catch (TimeoutException e) {
			System.out.println("Issue in Launch Browser");
		}

	}

	public static void MobileNumber(WebDriver driver, String mobileNumber) {
		try {
			
			Thread.sleep(1000);
//			WebElement element = driver.findElement(practiseForm.MOBILENUMBER);
//			
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).click().sendKeys(mobileNumber);
			
			driver.findElement(practiseForm.MOBILENUMBER).sendKeys(mobileNumber);
			
			
		} catch (Exception e) {
			System.out.println("Issue in "+mobileNumber);
		}
		
		
	}

	public static void Subject(WebDriver driver, String subject1) throws InterruptedException {
//		WebElement element= driver.findElement(practiseForm.SUBJECTS);
//		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().sendKeys(subject1);
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Inside DOM
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(practiseForm.SUBJECTS));

			ele.sendKeys(subject1);
			Thread.sleep(1000); // out of selenium

			driver.findElement(practiseForm.AUTOSUGGESTION_SUBJECTS).click();
			
			
		} catch (ElementNotInteractableException e) {
			
			System.out.println("ElementNotInteractableException in Subject");
			
		}
		
		
	}

	public static void Hobbies(WebDriver driver, String hobbies1) {
		try {
			
			WebElement element = driver.findElement(practiseForm.HOBBIES);
			
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build();
			
//			driver.findElement(practiseForm.HOBBIES).click();
			
		} catch (ElementNotInteractableException e) {
			System.out.println("Issue in "+hobbies1);
		}
		
		
		
	}

	public static void SelectDate(WebDriver driver) throws InterruptedException {
		
		try {
			
			WebElement element = driver.findElement(practiseForm.DATEPICKER);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
		
			WebElement element1 = driver.findElement(practiseForm.DOB);
			
			
			actions.moveToElement(element1).click().build();
			
			
			Select year = new Select(driver.findElement(practiseForm.DATE_YEAR));
			year.selectByValue("2030");
			
			
			Select month = new Select(driver.findElement(practiseForm.DATE_MONTH));
			month.selectByValue("8");
			
			List<WebElement> day = driver.findElements(practiseForm.DATE_PICKER);
			for (WebElement myDay : day)
			{
				System.out.println(myDay);
				myDay.click();
				break;
			}
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in Select Date");
		}
		catch (TimeoutException e) {
			System.out.println("TimeoutException in Select Date");
		}
		catch (ElementNotInteractableException e) {
			System.out.println("ElementNotInteractableException in Select Date");
		}
		
	}
	
	public static void address(WebDriver driver,String address1) {
		
		driver.findElement(practiseForm.ADDRESS).sendKeys(address1);
	}

	public static void UploadPic(WebDriver driver) throws InterruptedException {
		WebElement UploadImg = driver.findElement(practiseForm.PICTURE);
		
		Thread.sleep(3000);
		
		UploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());
		
		
	}

	public static void state(WebDriver driver, String state1) {
		driver.findElement(practiseForm.STATES).click();
		
		WebElement st = driver.findElement(practiseForm.STATE_VALUE);
		st.click();
		
		
	}

	public static void city(WebDriver driver, String city1) {
		driver.findElement(practiseForm.CITY).click();;
		
		WebElement cit = driver.findElement(practiseForm.CITY_VALUE);
		cit.click();
		
	}

	public static void submit(WebDriver driver) {
		driver.findElement(practiseForm.SUBMIT).click();
		
		
	}

	public static void CheckRegisterd(WebDriver driver) throws InterruptedException {
		
		
		WebElement element = driver.findElement(practiseForm.CONFIRMATION_POPUP);
		Actions actions = new Actions(driver);
		Thread.sleep(10000);
		actions.moveToElement(element).click().build().perform();
		
	}

	

}
