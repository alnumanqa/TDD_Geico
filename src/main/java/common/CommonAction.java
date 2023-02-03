package common;

import org.openqa.selenium.WebElement;
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

}
