package practiceTest;

import org.testng.annotations.Test;

import utils.AutoData;

public class UnitTest {

	@Test
	public void unitTestAutoDataNull() {
		AutoData data = new AutoData("Title", "14215", "Title", "02241993");
		System.out.println(data.getAboutYouPageTitle());

	}

	@Test
	public void unitTestAutoDataZeroLength() {
		AutoData data = new AutoData("Title", "14215", "Title", "02241993");
		System.out.println(data.getAboutYouPageTitle());

	}

}
