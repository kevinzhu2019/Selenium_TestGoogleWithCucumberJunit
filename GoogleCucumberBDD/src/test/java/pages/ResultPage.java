package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyExists() {
		WebElement result = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='SEGA']")));
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement result = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='SEGA']")));
		System.out.println("Window handles no is: " + driver.getWindowHandles().size());
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> It = windowhandles.iterator();
		while(It.hasNext()) {
			
		}
		return result.isDisplayed();
	}
}
