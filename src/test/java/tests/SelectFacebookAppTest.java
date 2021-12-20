package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FacebookAppPage;
import pages.FacebookSearchResultPage;

public class SelectFacebookAppTest extends TestBase{
	
	
	FacebookSearchResultPage SearchResultobject;
	FacebookAppPage Applicationobject ;



	@Test
	public void selectFacebookApp( ) { 
        
		SearchResultobject = new FacebookSearchResultPage(driver);
		Applicationobject = new FacebookAppPage(driver);
		String FacebookAppURL = "https://play.google.com/store/apps/details?id=com.facebook.katana";
		SearchResultobject.chooseApp();
		Assert.assertEquals(Applicationobject.FacebookIsDisplayed(),FacebookAppURL);
	}

}
