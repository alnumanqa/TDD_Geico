package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.Logs;

public class CommonAction {
	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + "---------> has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---------> Element not Found");
			Assert.fail();
		}
	}

	public static void validate(WebElement element, String expected) {
		String actual = element.getText();
		try {
			Logs.log("Validating ---> Actual : *** " + actual + " ***. Expected : *** " + expected + " ***");
			Assert.assertEquals(actual, expected);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---------> Element not Found");
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}

	public static void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---------> Element not Found");
			Assert.fail();
		}

	}

}
