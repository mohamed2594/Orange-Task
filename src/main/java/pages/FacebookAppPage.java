package pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookAppPage {
	
	private WebDriver driver ;
	private WebDriverWait wait;

	public FacebookAppPage(WebDriver driver) {
		this.driver = driver ;
	}

	public String FacebookIsDisplayed() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		return	driver.getCurrentUrl();
	}

}
