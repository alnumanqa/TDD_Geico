package test;

import org.testng.annotations.Test;
import base.BaseClass;

public class RentersQuoteTest extends BaseClass {

	@Test(enabled = false, groups =  {"renters", "non-functional"})
	public void rentersQutoeTest() throws InterruptedException {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
		homePage.insertZipcode("14215");
		homePage.clickGoBtn();
		homePage.selectRentersLOB();
		rayp.clickStratMyQuote();
		rayp.verifyRentersAboutYouPageTitle("Property Insurance");
		rayp.insertFirstName("Al");
		rayp.insertlasttName("Numan");
		rayp.insertDOB(driver);
//		rayp.clickNextBtn(driver);
//		rayp.insertAddress(driver);
//		rayp.insertAptNo("1");
//		rayp.insertZipcode("14215");
//		rayp.clickNextBtn(driver);		
	}

}
