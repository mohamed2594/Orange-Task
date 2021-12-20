package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.EducationPage;

public class AppsTest extends TestBase {

	AppsPage Appsobject;
	EducationPage Educationobject ;

	@Test
	public void ChooseEducationFromCategories() {

		Appsobject = new AppsPage(driver);
		Educationobject = new EducationPage(driver);
		String EducationURL = "https://play.google.com/store/apps/category/EDUCATION";
		Appsobject.showCategories();
		Appsobject.selectEducation();
		Assert.assertEquals(Educationobject.EducationIsDisplayed(),EducationURL);
		
	}


}
