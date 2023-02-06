package common;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import reporting.Logs;

public class CommonAction {
	public static void click(WebElement element) {
		element.click();
		Logs.log(element + "---------> has been clicked");
	}
	
	public static void validate(WebElement element, String expected) {
		String actual = element.getText();
		Logs.log("Validating ---> Actual : *** " + actual + " ***. Expected : *** " + expected + " ***");
		Assert.assertEquals(actual, expected);
	}
	
	public static void insert(WebElement element, String value) {
		element.sendKeys(value);
		Logs.log(value + " <--- This value has been passed into ---> " + element );
	}
	
	public static void explicitWait(WebDriver driver, WebElement element, String expected) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}

}
