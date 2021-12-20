package tests;

import org.testng.annotations.Test;

import pages.EducationPage;

public class FacebookSearchTest extends TestBase{
	
	EducationPage Educationobject ;
	
	@Test
	public void searchForFacebookApp() {

		Educationobject = new EducationPage(driver);
		Educationobject.search("Facebook");

	}
	

}
