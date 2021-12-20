package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

     private WebDriver driver ;
     private By AppsLink = By.xpath("//li[@class='uQeS5e qKjvAb iZhiic']//a[@class='mzRh0d']");
     
     public HomePage (WebDriver driver) {
    	 this.driver = driver;
     }
    	
	public void OpenAppsPage() {
		
		driver.findElement(AppsLink).click();
		
	}

}
