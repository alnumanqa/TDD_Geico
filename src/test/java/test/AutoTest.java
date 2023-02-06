package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass {

	@Test
	public void autoQuoteTest() throws InterruptedException {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
		homePage.insertZipcode("14215");
		homePage.clickGoBtn();
		homePage.selectAutoLOB();
		homePage.clickStartMyQuote();
		homePage.clickCoutinueBtn();
		Thread.sleep(2000);
		aboutYouPage.verifyAboutYouPageTitle("Let’s get started.");
		aboutYouPage.insertDOB("02241993");
		aboutYouPage.clickNextBtn();
		//Thread.sleep(4000);
		aboutYouPage.insertFirstName("Al");
		aboutYouPage.insertlasttName("Numan");
		aboutYouPage.clickNextBtn();
		

	}

}
