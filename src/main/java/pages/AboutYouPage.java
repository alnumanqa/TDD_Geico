package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonAction.*;

//import java.time.Duration;

public class AboutYouPage {

	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Let’s get started.']")
	WebElement autoAboutYouPageTitle;
	@FindBy(xpath = "//input[@class='date']")
	WebElement dateOfBirth;
	@FindBy(css = "button.btn.btn--primary.btn--full-mobile.btn--pull-right")
	WebElement nextBtn01;
	@FindBy(xpath = "//input[@id='Id_GiveName_43617']")
	WebElement firstNameField;
	@FindBy(id = "Id_GiveName_25419")
	WebElement lastNameField;
	WebElement nextBtn02;
	WebElement addressField;
	WebElement aptField;
	WebElement SSiField;
	WebElement nextBtn03;
	WebElement year;
	WebElement make;
	WebElement modle;

	public void verifyAboutYouPageTitle(String expectedTitle) {
		validate(autoAboutYouPageTitle, expectedTitle);
	}

	public void insertDOB(String dob) {
		insert(dateOfBirth, dob);
	}

	public void clickNextBtn() {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.elementToBeClickable(nextBtn01)).click();
		click(nextBtn01);
	}

	public void insertFirstName(String firstName) {
		insert(firstNameField, firstName);
	}

	public void insertlasttName(String lastName) {
		insert(lastNameField, lastName);
	}

}
