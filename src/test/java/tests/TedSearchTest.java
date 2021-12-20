package tests;

import org.testng.annotations.Test;

import pages.EducationPage;

public class TedSearchTest extends TestBase{

	EducationPage Educationobject ;


	@Test
	public void searchForTedApp() {

		Educationobject = new EducationPage(driver);
		Educationobject.search("ted");

	}



}
