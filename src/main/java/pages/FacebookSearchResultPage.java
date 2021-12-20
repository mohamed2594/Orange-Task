package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSearchResultPage {
	
	private WebDriver driver ;
	private WebDriverWait wait ;
	private By FacebookIcon = By.xpath("//a[@href='/store/apps/details?id=com.facebook.katana']");
			
	public FacebookSearchResultPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void chooseApp() {
		
    	wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FacebookIcon));
		driver.findElement(FacebookIcon).click();
		
	}

}
