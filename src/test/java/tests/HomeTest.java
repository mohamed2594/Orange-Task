package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.HomePage;

public class HomeTest extends TestBase{
	
	HomePage homeobject ;
	AppsPage Appsobject ;
	
	
	@Test
	public void OpenAppsLink() {
		
		homeobject = new HomePage(driver);
		Appsobject = new AppsPage(driver);
		String AppsURL = "https://play.google.com/store/apps";
		homeobject.OpenAppsPage();
		Assert.assertEquals(Appsobject.MyAppsLinkAppears(),AppsURL);	
		
	}
	
	
	

}
