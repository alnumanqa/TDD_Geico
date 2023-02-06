package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "h1")
	WebElement homepageTitle;
	@FindBy(id = "ssp-service-zip")
	WebElement zipcodeField;
	@FindBy(xpath = "//input[@value='Go']")
	WebElement goBtn;
	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement autoLOB;
	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement starMyQuoteBtn;
	@FindBy(css = "input.btn.btn--primary.btn--full-mobile")
	WebElement continueBtn;
	
	
	public void verifyHomepageTitle(String expectedTitle) {
		validate(homepageTitle, expectedTitle);
	}
	
	public void insertZipcode(String zip) {
		insert(zipcodeField, zip);
	}
	
	public void clickGoBtn() {
		click(goBtn);
	}
	
	public void selectAutoLOB() {
		click(autoLOB);
	}
	
	public void clickStartMyQuote() {
		click(starMyQuoteBtn);
	}
	
	public void clickCoutinueBtn() {
		click(continueBtn);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
