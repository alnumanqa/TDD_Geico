package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class LoginPage {
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Log In']//parent::a")
	WebElement login01;
	@FindBy(className = "user-zip")
	WebElement zipcode;
	@FindBy(xpath = "(//button[@id='manageSubmit'])[1]")
	WebElement login02;
	@FindBy(xpath = "//input[@id='TextInputComponent-1']")
	WebElement userIdField;
	@FindBy(xpath = "//input[@id='TextInputComponent-2']")
	WebElement userPassowardField;
	public void clickLoginBtn01() {
		 click(login01);
	}
	
	public void inputZipcode(String zipcode) {
		insert(login01, zipcode);
	}
	
	public void clickLoginBtn02() {
		click(login02);
	}
	
	public void inputId(String id) {
		insert(userIdField, id);
	}
	
	public void inputPasswoard(String password) {
		insert(userPassowardField, password);
	}

}
