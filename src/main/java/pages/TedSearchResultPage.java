package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TedSearchResultPage {
	
	private WebDriver driver ;
	private WebDriverWait wait ;
    private By TedIcon = By.xpath("//a[@href='/store/apps/details?id=com.ted.android']");
			
	public TedSearchResultPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void chooseApp() {
		
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TedIcon));
		driver.findElement(TedIcon).click();
		
	}


}
