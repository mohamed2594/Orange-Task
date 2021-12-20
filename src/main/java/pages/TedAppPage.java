package pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TedAppPage {

	private WebDriver driver ;
	private WebDriverWait wait;

	public TedAppPage(WebDriver driver) {
		this.driver = driver ;
	}

	public String tedIsDisplayed() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("TED"));
		return	driver.getCurrentUrl();
	}

}
