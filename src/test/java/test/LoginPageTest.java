package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.BaseClass;
import reporting.Logs;

public class LoginPageTest extends BaseClass {

	@Test(enabled = false, priority = 1, groups = { "login", "non-functional" })
	public void loginTest() throws InterruptedException {
		loginPage.clickLoginBtn01();
		loginPage.inputZipcode("14215");
		loginPage.clickLoginBtn02();

	}

	@Test(enabled = false, priority = 2, dependsOnMethods = "loginTest", ignoreMissingDependencies = true, groups = {
			"login" })
	public void userDataInput() {
		loginPage.clickLoginBtn01();
		loginPage.inputZipcode("14215");
		loginPage.clickLoginBtn02();
		loginPage.inputId("numan");
		loginPage.inputPasswoard("1234");
	}

	@Test(enabled = false, groups = { "login", "non-functional" }, retryAnalyzer = retry.RetryFailedTest.class)
	public void retryTest() {
		Logs.log("Retry Test");
		Assert.fail();

	}

	@Test(enabled = false)
	public void mockTest() {
		Logs.log("MockTest");
		Assert.fail();
	}

	@Test(enabled = true, invocationCount = 2)
	public void mockTest01() {
		Logs.log("MockTest01");
	}

}
