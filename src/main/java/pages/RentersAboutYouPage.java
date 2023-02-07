package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonAction.*;

import java.time.Duration;

public class RentersAboutYouPage {

	public RentersAboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a.modal-trigger.btn.btn--primary.btn--full-mobile")
	WebElement startMyQuote;

	@FindBy(xpath = "(//h4)[2]")
	WebElement rentersAboutYouPageTitle;
	@FindBy(xpath = "(//input[@size='21'])[1]")
	WebElement firstNameField;
	@FindBy(xpath = "(//input[@size='21'])[2]")
	WebElement lastNameField;
	@FindBy(xpath = "//input[@class='date']")
	WebElement dateOfBirth;
	@FindBy(css = "button.btn.btn--primary.btn--full-mobile.btn--pull-right")
	WebElement nextBtn;
	@FindBy(xpath = "//input[@size='31']")
	WebElement addressField;
	@FindBy(xpath = "(//input[@size='6'])[1]")
	WebElement aptfield;
	@FindBy(xpath = "(//input[@size='6'])[2]")
	WebElement zipcodeField;
	
	public void clickStratMyQuote() {
		click(startMyQuote);
	}

	public void verifyRentersAboutYouPageTitle(String expectedTitle) {
		validate(rentersAboutYouPageTitle, expectedTitle);
	}

	public void insertFirstName(String firstName) {
		insert(firstNameField, firstName);
	}

	public void insertlasttName(String lastName) {
		insert(lastNameField, lastName);
	}

	public void insertDOB(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='02/27/1993'", dateOfBirth);
		
	}

	public void clickNextBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
	}

	public void insertAddress(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(addressField)).sendKeys("41 Marne rd");
	}

	public void insertAptNo(String aptNo) {
		insert(aptfield, aptNo);
	}

	public void insertZipcode(String zip) {
		insert(zipcodeField, zip);
	}

}
