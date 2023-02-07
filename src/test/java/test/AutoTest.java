package test;

import org.testng.annotations.Test;
import base.BaseClass;

public class AutoTest extends BaseClass {

	@Test(enabled = false)
	public void autoQuoteTest() throws InterruptedException {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
		homePage.insertZipcode("14215");
		homePage.clickGoBtn();
		Thread.sleep(3000);
		homePage.selectAutoLOB();
		Thread.sleep(3000);
		homePage.clickStartMyQuote();
		Thread.sleep(2000);
		homePage.clickCoutinueBtn();
		Thread.sleep(2000);
		aboutYouPage.verifyAboutYouPageTitle("Let’s get started.");
		aboutYouPage.insertDOB("02241993");
		aboutYouPage.clickNextBtn();
		//Thread.sleep(4000);
		aboutYouPage.insertFirstName("Al");
		aboutYouPage.insertlasttName("Numan");
		//aboutYouPage.clickNextBtn();
		

	}

}
