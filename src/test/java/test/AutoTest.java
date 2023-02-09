package test;

import org.testng.annotations.Test;
import base.BaseClass;

public class AutoTest extends BaseClass {

	
	@Test(enabled = true, groups = { "auto", "non-functional" })
	public void autoQuoteTest()
			throws InterruptedException {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
		homePage.insertZipcode("14215");
		homePage.clickGoBtn();
		homePage.selectAutoLOB();
		homePage.clickStartMyQuote();
		homePage.clickCoutinueBtn();
		aboutYouPage.verifyAboutYouPageTitle("Let’s get started.");
		aboutYouPage.insertDOB("02271995");
//		aboutYouPage.clickNextBtn();
//		aboutYouPage.insertFirstName("Al");
//		aboutYouPage.insertlasttName("Numan");
//		aboutYouPage.clickNextBtn();

	}

}
