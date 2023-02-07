package test;

import org.testng.annotations.Test;
import base.BaseClass;

public class RentersQuoteTest extends BaseClass {

	@Test(enabled = false)
	public void rentersQutoeTest() throws InterruptedException {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
		homePage.insertZipcode("14215");
		homePage.clickGoBtn();
		Thread.sleep(3000);
		homePage.selectRentersLOB();
		rayp.clickStratMyQuote();
		// Thread.sleep(2000);
		rayp.verifyRentersAboutYouPageTitle("Let's start with your name and date of birth.");
		rayp.insertFirstName("Al");
		Thread.sleep(2000);
		rayp.insertlasttName("Numan");
		Thread.sleep(2000);
		rayp.insertDOB(driver);
//		Thread.sleep(3000);
//		rayp.clickNextBtn(driver);
//		Thread.sleep(3000);
//		rayp.insertAddress(driver);
//		Thread.sleep(2000);
//		rayp.insertAptNo("1");
//		Thread.sleep(2000);
//		rayp.insertZipcode("14215");
//		Thread.sleep(2000);
//		rayp.clickNextBtn(driver);
//		
	}

}
