package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.BaseClass;

public class ParameterizedLoginTest extends BaseClass {
	
	@Parameters({"expecedTitle", "zipcode", "userName", "Password"})
	@Test(enabled = true, priority = 2, groups = "login")
	public void userDataInput(String expecedTitle, String zipcode, String userName, String Password) {
		homePage.verifyHomepageTitle(expecedTitle);
		loginPage.clickLoginBtn01();
		loginPage.inputZipcode(zipcode);
		loginPage.clickLoginBtn02();
		loginPage.inputId(userName);
		loginPage.inputPasswoard(Password);
	}
	
	@Parameters({ "expectedHomePageTitle", "zipcode", "aboutYouPageTitle", "dob" })
	@Test(enabled = true, groups = { "auto", "non-functional" })
	public void autoQuoteTest(String expectedHomePageTitle, String zipcode, String aboutYouPageTitle, String dob)
			throws InterruptedException {
		homePage.verifyHomepageTitle(expectedHomePageTitle);
		homePage.insertZipcode(zipcode);
		homePage.clickGoBtn();
		homePage.selectAutoLOB();
		homePage.clickStartMyQuote();
		homePage.clickCoutinueBtn();
		aboutYouPage.verifyAboutYouPageTitle(aboutYouPageTitle);
		aboutYouPage.insertDOB(dob);

	}

}
