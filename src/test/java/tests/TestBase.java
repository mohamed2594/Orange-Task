package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase {
	
	
	public static WebDriver driver ;
	
	
	@BeforeSuite
	@Parameters({"browser"})
	public void openDriver(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver = new ChromeDriver() ;
		}
		else if  (browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver = new FirefoxDriver() ;
		}
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://play.google.com");
	}
	
	@AfterSuite
	public void closeDriver() {
		
		driver.quit() ;
	}

}
