package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class LoginPageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void loginTest() throws InterruptedException {
		loginPage.clickLoginBtn01();
		loginPage.inputZipcode("14215");
		loginPage.clickLoginBtn02();

	}

	@Test(enabled = true, priority = 2, dependsOnMethods = "loginTest", ignoreMissingDependencies = true)
	public void userDataInput() {
		loginPage.clickLoginBtn01();
		loginPage.inputZipcode("14215");
		loginPage.clickLoginBtn02();
		loginPage.inputId("numan");
		loginPage.inputPasswoard("1234");
	}

}
