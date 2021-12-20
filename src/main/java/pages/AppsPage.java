package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppsPage {
	
	private WebDriver driver ;
	private WebDriverWait wait ;
	private By CategoriesDropdown = By.xpath("//button[@class='qAAUy']");
	private By EducationLink = By.xpath("//a[@href='/store/apps/category/EDUCATION']");
	
	public AppsPage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String MyAppsLinkAppears( ) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.urlMatches("https://play.google.com/store/apps"));
		return driver.getCurrentUrl();
	}
	
	public void showCategories( ) {
		
		
		driver.findElement(CategoriesDropdown).click();
	}
	
	public void selectEducation( ) {
		

		driver.findElement(EducationLink).click();
	}

}
