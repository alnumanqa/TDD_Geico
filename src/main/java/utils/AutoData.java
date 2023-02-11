package utils;

public class AutoData {

	private String homepageTitle;
	private String zipcodeField;
	private String aboutYouPageTitle;
	private String dateOfBirth;

	public AutoData(String homepageTitle, String zipcodeField, String aboutYouPageTitle, String dateOfBirth) {
		if (homepageTitle == null || zipcodeField == null || aboutYouPageTitle == null || dateOfBirth == null
				|| homepageTitle.length() == 0 || zipcodeField.length() == 0 || aboutYouPageTitle.length() == 0
				|| dateOfBirth.length() == 0) {
			throw new NullPointerException();
		} else {
			this.homepageTitle = homepageTitle;
			this.zipcodeField = zipcodeField;
			this.aboutYouPageTitle = aboutYouPageTitle;
			this.dateOfBirth = dateOfBirth;
		}
	}

	public String getHomepageTitle() {
		return homepageTitle;
	}

	public String getZipcodeField() {
		return zipcodeField;
	}

	public String getAboutYouPageTitle() {
		return aboutYouPageTitle;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

}
