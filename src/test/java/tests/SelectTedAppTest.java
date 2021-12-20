package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TedSearchResultPage;
import pages.TedAppPage;

public class SelectTedAppTest extends TestBase{

	TedSearchResultPage SearchResultobject;
	TedAppPage Applicationobject ;



	@Test
	public void selectTedApp( ) { 
        
		SearchResultobject = new TedSearchResultPage(driver);
		Applicationobject = new TedAppPage(driver);
		String TedAppURL = "https://play.google.com/store/apps/details?id=com.ted.android";
		SearchResultobject.chooseApp();
		Assert.assertEquals(Applicationobject.tedIsDisplayed(),TedAppURL);
	}

}
