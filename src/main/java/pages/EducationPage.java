package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EducationPage {
	
	private WebDriver driver ;
	private WebDriverWait wait;
	private By SearchTextbox = By.id("gbqfq");
	private By SearchButton = By.id("gbqfb");
	
	public EducationPage (WebDriver driver) {
		
		this.driver = driver ;
	}
	
	public String EducationIsDisplayed() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlMatches("https://play.google.com/store/apps/category/EDUCATION"));
		return driver.getCurrentUrl();
	}
	
	public void search(String application) {
		
		driver.findElement(SearchTextbox).sendKeys(application);
		driver.findElement(SearchButton).click();
	}
	

}
